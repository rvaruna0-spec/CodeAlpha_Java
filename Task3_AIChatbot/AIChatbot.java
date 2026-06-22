

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AIChatbot {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CodeAlpha AI Chatbot");

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        JTextField inputField =
                new JTextField();

        JButton sendButton =
                new JButton("Send");

        frame.setLayout(new BorderLayout());

        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(inputField,
                BorderLayout.CENTER);

        panel.add(sendButton,
                BorderLayout.EAST);

        frame.add(panel,
                BorderLayout.SOUTH);

        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        chatArea.append(
                "Bot: Hello! I am CodeAlpha ChatBot.\n");

        sendButton.addActionListener(
                new ActionListener() {

            public void actionPerformed(
                    ActionEvent e) {

                String userMessage =
                        inputField.getText().toLowerCase();

                chatArea.append(
                        "You: " + userMessage + "\n");

                String response;

                if(userMessage.contains("hi")
                        || userMessage.contains("hello")) {

                    response =
                            "Hello! Nice to meet you.";

                }

                else if(userMessage.contains("how are you")) {

                    response =
                            "I am doing great. Thanks for asking.";

                }

                else if(userMessage.contains("your name")) {

                    response =
                            "I am CodeAlpha AI ChatBot.";

                }

                else if(userMessage.contains("java")) {

                    response =
                            "Java is a powerful object-oriented programming language.";

                }

                else if(userMessage.contains("internship")) {

                    response =
                            "Internships help you gain practical experience.";

                }

                else if(userMessage.contains("python")) {

                    response =
                            "Python is one of the most popular programming languages.";

                }

                else if(userMessage.contains("bye")) {

                    response =
                            "Goodbye! Have a great day.";

                }

                else if(userMessage.contains("thank")) {

                    response =
                            "You're welcome.";

                }

                else if(userMessage.contains("help")) {

                    response =
                            "I can answer questions about Java, Python and internships.";

                }

                else {

                    response =
                            "Sorry, I don't understand that yet.";

                }

                chatArea.append(
                        "Bot: " + response + "\n\n");

                inputField.setText("");
            }
        });
    }
}