// Function to start the timer
window.onload = function () {
  let totalSeconds = 0;

  // Update the timer every second
  setInterval(function () {
    totalSeconds++;

    // Calculate minutes and seconds
    let minutes = Math.floor(totalSeconds / 60);
    let seconds = totalSeconds % 60;
    
    // Format minutes and seconds to always show two digits
    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;

    // Update the timer display
    document.getElementById("timer").textContent = minutes + ":" + seconds;
  }, 1000); // 1000 milliseconds = 1 second
};
