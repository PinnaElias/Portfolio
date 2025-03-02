#FAQ Chatbot with Streamlit

This project is a simple FAQ chatbot application built using Streamlit and the Transformers library from Hugging Face. It allows users to input a question, and the chatbot responds with the most relevant answer from a predefined FAQ dataset.
Features

    Interactive FAQ Chatbot: The chatbot takes user input (a question) and returns the most relevant answer from the FAQ list.
    Pretrained Question-Answering Model: Uses a pretrained model from Hugging Face to find the best answer based on the user's query.
    Streamlit Interface: A clean and simple interface built with Streamlit for easy interaction.

##Requirements

    Python 3.7 or higher
    Streamlit
    Hugging Face Transformers

##Installation

    Clone the repository or download the code files.

download directory https://github.com/PinnaElias/Portfolio/tree/main/chatbot-faq-llm

Install the required dependencies using pip:

    pip install streamlit
    pip install transformers

##Usage

    Ensure all dependencies are installed.

    Run the Streamlit app:

    py -3.13 -m streamlit run app.py

    Open your browser and go to the URL provided by Streamlit (usually http://localhost:8501).

    Enter a question in the input box, and the chatbot will return the most relevant answer from the FAQ list.

##FAQ Dataset

The FAQ dataset is stored in a separate Python file (faq_data.py). The dataset contains a list of questions and answers that the chatbot can use to provide responses.
How It Works

    Question Answering Pipeline: The application uses Hugging Face’s question-answering pipeline, which leverages a pretrained model to match the user’s input with the most appropriate answer from the FAQ list.
    Streamlit UI: Streamlit is used to create the interface, including an input box for users to submit questions and a display section for showing the answers.