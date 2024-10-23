<?php
// Database connection variables
$host = "localhost";
$username = "root";  // Replace with your MySQL username
$password = "";      // Replace with your MySQL password
$dbname = "biblophyl_quiz"; // Replace with your database name

// Create a connection to the database
$conn = new mysqli($host, $username, $password, $dbname);

// Check if the connection was successful
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Query to fetch all quiz questions and their options
$sql = "SELECT question_text, option_a, option_b, option_c, option_d, correct_answer, solution FROM quizzes";
$result = $conn->query($sql);

// Check if the query returns any rows
if ($result->num_rows > 0) {
    // Output data for each question
    while($row = $result->fetch_assoc()) {
        echo "<div class='quiz-question'>";
        echo "<p><strong>Question:</strong> " . $row["question_text"] . "</p>";
        echo "<ul>";
        echo "<li>A: " . $row["option_a"] . "</li>";
        echo "<li>B: " . $row["option_b"] . "</li>";
        echo "<li>C: " . $row["option_c"] . "</li>";
        echo "<li>D: " . $row["option_d"] . "</li>";
        echo "</ul>";
        echo "<p><strong>Correct Answer:</strong> " . $row["correct_answer"] . "</p>";
        echo "<p><strong>Solution:</strong> " . $row["solution"] . "</p>";
        echo "</div><hr>";
    }
} else {
    echo "No quiz questions found!";
}

// Close the database connection
$conn->close();
?>
