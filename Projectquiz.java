


package com.mycompany.projectquiz;

import java.util.Scanner;

public class Projectquiz {

    static String[] questions = {
        "Which of the following is an example of climate change mitigation?",
        "Which of these is NOT an impact of climate change?",
        "What does an early warning system for climate-related hazards do?",
        "What is the main cause of global warming?",
        "Which of the following is a renewable energy source?",
        "What percentage of the Earth's surface is covered by water?",
        "Which gas is primarily responsible for the greenhouse effect?",
        "What is the main effect of deforestation on the environment?",
        "What does carbon footprint refer to?",
        "Which organization is responsible for global climate action?",
        "What is the Paris Agreement about?",
        "What is the concept of carbon offsetting?"
    };

    static String[][] options = {
        {"A) Building sea walls to protect coastal areas", "B) Developing early warning systems for extreme weather", "C) Planting trees to absorb carbon dioxide", "D) Preparing disaster relief teams for floods"},
        {"A) Rising sea levels", "B) Decreased frequency of extreme weather events", "C) More frequent and severe heatwaves", "D) Melting polar ice caps"},
        {"A) Predicts the exact date of a natural disaster", "B) Provides forecasts to help communities prepare for extreme events like floods or storms", "C) Reduces global temperatures", "D) Helps countries build more roads and infrastructure"},
        {"A) Deforestation", "B) Burning of fossil fuels", "C) Agricultural practices", "D) None of the above"},
        {"A) Coal", "B) Solar power", "C) Natural gas", "D) Oil"},
        {"A) 30%", "B) 50%", "C) 70%", "D) 90%"},
        {"A) Carbon dioxide", "B) Oxygen", "C) Nitrogen", "D) Methane"},
        {"A) Increased biodiversity", "B) Loss of habitats", "C) Increase in oxygen levels", "D) None of the above"},
        {"A) The amount of water used", "B) The amount of carbon emitted", "C) The amount of waste produced", "D) None of the above"},
        {"A) World Wildlife Fund (WWF)", "B) United Nations (UN)", "C) International Energy Agency (IEA)", "D) Greenpeace"},
        {"A) A financial agreement to fund climate change research", "B) A legally binding treaty for all countries to reduce emissions", "C) A voluntary agreement to combat climate change", "D) A pact for deforestation prevention"},
        {"A) Planting trees to balance carbon emissions", "B) Reducing waste in landfills", "C) Increasing the use of fossil fuels", "D) None of the above"}
    };

    static String[] correctAnswers = {"C", "B", "B", "B", "B", "C", "A", "B", "B", "B", "C", "A"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        
        System.out.println("Hello, welcome to the Climate Change Quiz! Let's test your knowledge about climate change.");
        System.out.println("Try to answer all questions correctly. Good luck!\n");
        System.out.println("You can type 'Q' at any point to quit the quiz.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            String userAnswer = "";

            while (true) {
                System.out.print("Enter the letter of your answer (A/B/C/D) or 'Q' to quit: ");
                userAnswer = scanner.nextLine().toUpperCase();  // Convert input to uppercase

                if (userAnswer.equals("A") || userAnswer.equals("B") || userAnswer.equals("C") || userAnswer.equals("D")) {
                    break; 
                } else if (userAnswer.equals("Q")) {
                    System.out.println("You have chosen to quit the quiz.");
                    System.out.println("Your final score is: " + score + " out of " + questions.length);
                    System.out.println("Thanks for playing!");
                    scanner.close();
                    return;  // Exit the program
                } else {
                    System.out.println("Oops! That's not a valid option. Please enter A, B, C, D, or Q.");
                }
            }

            if (userAnswer.equals(correctAnswers[i])) {
                score++;  
                System.out.println("Nice job! Correct Answer.");
            } else {
                System.out.println("That's not correct. The correct answer is: " + correctAnswers[i]);
            }

            System.out.println();  
        }

        // Final message with score
        System.out.println("Well done! You have completed the quiz.");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        
        if (score == questions.length) {
            System.out.println("Amazing! You got all answers right!");
        } else {
            System.out.println("Keep learning and try again!");
        }

        scanner.close();
    }
}
