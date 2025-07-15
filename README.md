# 🧠 Java Console Quiz App

This is a simple **Java console-based Quiz Application**.  
Users are prompted with 5 multiple-choice questions and receive immediate feedback after each answer.

---

## 🎯 Features

- 5 built-in quiz questions (stored as objects)
- Multiple-choice format with 4 options each
- User receives instant feedback (Correct/Wrong)
- Final score displayed at the end
- Console-based interaction using Scanner

---

## 👨‍💻 Technologies Used

- Java (JDK 17+)
- Console I/O using `Scanner`
- Object-Oriented Programming (OOP)

---

## 📦 Project Structure

QuizApp/
├── Question.java
├── QuestionService.java
└── Main.java

markdown
Copy
Edit

- `Question.java`: A class representing a single quiz question
- `QuestionService.java`: Handles quiz flow, stores user selections, gives feedback and calculates score
- `Main.java`: Entry point of the app — just calls `playQuiz()`

---

## 🚀 How to Run the App

1. Make sure you have Java installed (`java -version`)
2. Compile all `.java` files:
   ```bash
   javac *.java
Run the app:

bash
Copy
Edit
java Main
🖼️ Sample Output
markdown
Copy
Edit
Question no. :1
What is the capital of France?
1. Berlin
2. Madrid
3. Paris
4. Rome
Your answer: Madrid
Wrong! The correct answer is: Paris

...

Your Answers:
Madrid
4
Jupiter
Tiger
George Orwell
Total score: 4/5
✅ What I Practiced
Java classes, constructors, arrays, and methods

Comparing strings using .equalsIgnoreCase()

Real-time user input with Scanner

Controlling quiz flow and feedback in a single class

🛠️ Future Improvements
Load questions from a file or database

Randomize question order

Add difficulty levels and categories

Export score to a file

👤 Author
Mahmoud Samir
Java Backend Learner | Practicing OOP & console applications
🔗 GitHub: @mahmoud-samiir

