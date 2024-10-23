// Fetch the questions from the JSON file
        fetch('questions.json')
            .then(response => response.json())
            .then(data => {
                // Iterate over the questions
                data.forEach((item, index) => {
                    // Get the question, options, and answer
                    const questionText = `Question ${index + 1}: ${item.question}`;
                    const optionsText = `Options: ${item.options.join(", ")}`;
                    const answerText = `Answer: ${item.answer}`;

                    // Create new h4 elements for each question
                    const questionElement = document.createElement('h4');
                    questionElement.textContent = questionText;

                    const optionsElement = document.createElement('h4');
                    optionsElement.textContent = optionsText;

                    const answerElement = document.createElement('h4');
                    answerElement.textContent = answerText;

                    // Append the elements to the container
                    document.getElementById('question-container').appendChild(questionElement);
                    document.getElementById('question-container').appendChild(optionsElement);
                    document.getElementById('question-container').appendChild(answerElement);
                });
            })
            .catch(error => {
                console.error('Error fetching the questions:', error);
            });
