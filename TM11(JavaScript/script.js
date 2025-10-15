// --- 1. Display Current Date and Time ---
function showDateTime() {
    const dtContainer = document.getElementById('datetime-container');
    const now = new Date();
    // Formats the date and time nicely
    const formattedDateTime = now.toLocaleString();
    dtContainer.innerHTML = formattedDateTime;
}
// Update the time every second
setInterval(showDateTime, 1000);
// Show time immediately on page load
showDateTime();


// --- 2. Timeout Alert ---
// Set a timer for 3 minutes (180,000 milliseconds)
setTimeout(() => {
    alert("3 mins past.");
}, 180000);


// --- 3. Form Validation Function ---
function validateForm() {
    // Get values from all form fields
    const firstName = document.getElementById('firstName').value.trim();
    const lastName = document.getElementById('lastName').value.trim();
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const gender = document.querySelector('input[name="gender"]:checked');
    const mobile = document.getElementById('mobile').value.trim();
    const dob = document.getElementById('dob').value.trim();
    const email = document.getElementById('email').value.trim();

    // Regular Expressions for validation patterns
    const namePattern = /^[A-Za-z]+$/;
    const mobilePattern = /^\d{3}[-.\s]\d{3}[-.\s]\d{4}$/; // Matches XXX-XXX-XXXX, XXX.XXX.XXXX, XXX XXX XXXX
    const dobPattern = /^\d{2}-\d{2}-\d{4}$/; // Matches DD-MM-YYYY

    // --- Validation Checks ---

    // First Name
    if (firstName === "") {
        alert("First Name must be entered.");
        return false;
    }
    if (!namePattern.test(firstName)) {
        alert("First Name must contain only characters.");
        return false;
    }

    // Last Name
    if (lastName === "") {
        alert("Last Name must be entered.");
        return false;
    }
    if (!namePattern.test(lastName)) {
        alert("Last Name must contain only characters.");
        return false;
    }
    
    // Password
    if (password === "") {
        alert("Password must be entered.");
        return false;
    }
    if (password.length < 6 || password.length > 20) {
        alert("Password length should be between 6 to 20 characters.");
        return false;
    }

    // Confirm Password
    if (confirmPassword === "") {
        alert("Confirm Password must be entered.");
        return false;
    }
    if (password !== confirmPassword) {
        alert("Password and Confirm Password should be the same.");
        return false;
    }

    // Gender
    if (!gender) {
        alert("Gender must be selected.");
        return false;
    }

    // Mobile Number
    if (mobile === "") {
        alert("Mobile Number must be entered.");
        return false;
    }
    if (!mobilePattern.test(mobile)) {
        alert("Mobile Number must be in the format XXX-XXX-XXXX or similar.");
        return false;
    }

    // Date of Birth
    if (dob === "") {
        alert("Date of Birth must be entered.");
        return false;
    }
    if (!dobPattern.test(dob)) {
        alert("Date of Birth must be in the format DD-MM-YYYY.");
        return false;
    }

    // Email Address
    if (email === "") {
        alert("Email Address must be entered.");
        return false;
    }
    // Check for '@' and its position
    if (email.indexOf('@') <= 0) {
        alert("Invalid email format: '@' is missing or is the first character.");
        return false;
    }
    // Check for '.' after the '@' sign
    if (email.lastIndexOf('.') < email.indexOf('@') + 2) {
        alert("Invalid email format: Domain is missing a dot or dot is misplaced.");
        return false;
    }


    // If all checks pass
    alert("Registration successful!");
    return true; // Allows the form to be submitted
}