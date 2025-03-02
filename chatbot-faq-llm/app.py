import streamlit as sl
from transformers import pipeline
from faq_data import faq_list

#modello pre-addestrato
qa_pipeline = pipeline("question-answering")

sl.title("Amazon-like chatbot FAQ")
user_question = sl.text_input("Fai una domanda: ")

def get_answer(user_question, faq_list):
    if user_question:
        best_Answer = None
        highest_score = 0
        
        #loop sulle faq
        for faq in faq_list:
            answer = qa_pipeline(question = user_question, context = faq["answer"])
            score = answer["score"]

            if score > highest_score:
                best_Answer = faq["answer"]
                highest_score = score
                
        return best_Answer
    return None
                
        
if __name__ == "__main__":
    if user_question:
        response = get_answer(user_question, faq_list)
        
        if response:
            sl.write(f"Risposta: {response}")
        else:
            sl.write("Non ho trovato una risposta adeguata.")
    else:
        sl.write("inserisci una domanda: ")