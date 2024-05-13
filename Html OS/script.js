function printSystemDateTime() {
    var currentDateTime = new Date();
    var formattedDateTime = currentDateTime.toLocaleDateString() + ' ' + currentDateTime.toLocaleTimeString();
    var currentDateSpan = document.getElementById('currentDate');
    currentDateSpan.textContent = formattedDateTime;
    currentDateSpan.style.fontSize = '14px';
    currentDateSpan.style.color = 'white';
}

let windows_key_activated = false;

function Window_Key_Press() {
    if (!windows_key_activated) {
        document.getElementById("Window_Key_Press").style.display = "flex";
        windows_key_activated = true;
    } else {
        document.getElementById("Window_Key_Press").style.display = "none";
        windows_key_activated = false;
    }
}




let My_Computer_instance_var = false;
let taskbarImage;

function My_Computer_instance() {
    if (!My_Computer_instance_var) {
        // Display the My_Computer_instance
        document.getElementById("My_Computer_instance").style.display = "flex";
        My_Computer_instance_var = true;

        // Create a new image element
        var img = document.createElement("img");

        // Set the source and class of the image
        img.src = "/images/My_Computer.png";
        img.classList.add("Image_Taskbar_icons");

        // Get the target element by its ID
        var targetElement = document.getElementById("taskbar");

        // Append the image to the target element
        targetElement.appendChild(img);

        // Store a reference to the image for later removal
        taskbarImage = img;
    } else {
        // Hide the My_Computer_instance
        document.getElementById("My_Computer_instance").style.display = "none";
        My_Computer_instance_var = false;

        // Check if the image exists before attempting to remove it
        if (taskbarImage && taskbarImage.parentNode) {
            taskbarImage.parentNode.removeChild(taskbarImage);
        }
    }
}










function Close_My_Computer_Instance(){
    document.getElementById("My_Computer_instance").style.display = "none";
    My_Computer_instance_var = false;

        // Check if the image exists before attempting to remove it
        if (taskbarImage && taskbarImage.parentNode) {
            taskbarImage.parentNode.removeChild(taskbarImage);
        }
}

function sendEmail() {
    window.location.href = "mailto:mani194580@gmail.com";
}

let Disk_D_var = false;
function Disk_D(){
    if (!Disk_D_var) {
        document.getElementById("Disk_D").style.display = "flex";
        Disk_D_var = true;
    } else {
        document.getElementById("Disk_D").style.display = "none";
        Disk_D_var = false;
    }
}

let Back_D_var = false;
function Back_D(){
    if (!Back_D_var) {
        document.getElementById("Disk_D").style.display = "flex";
        Back_D_var = true;
    } else {
        document.getElementById("Disk_D").style.display = "none";
        Back_D_var = false;
    }
}

function toggleBrowser() {
    // Prompt the user to enter a URL
    document.getElementById("Closebtn").style.display = "block"
    document.getElementById("My_website").style.display = "block"
    let website_URL = window.prompt("Enter URL: ");

    // Check if the URL starts with "http://" or "https://"
    if (!website_URL.startsWith("http://") && !website_URL.startsWith("https://")) {
        // If not, add the "https://" prefix
        website_URL = "https://" + website_URL;
    }

    // Get the browser container element
    var browserContainer = document.getElementById("browserContainer");

    // Toggle the display of the browser container
    if (browserContainer.style.display === "none") {
        browserContainer.style.display = "block";
    } else {
        browserContainer.style.display = "none";
    }

    // Set the src attribute of the iframe to the entered URL
    var iframe = document.getElementById("embeddedBrowser");
    iframe.src = website_URL;
}
function Close_Chrome() {
    var browserContainer = document.getElementById("browserContainer");
    var closeBtn = document.getElementById("Closebtn");

    if (browserContainer) {
        browserContainer.style.display = "none";
    }

    if (closeBtn) {
        closeBtn.style.display = "none";
        document.getElementById("My_website").style.display = "none";
    }
}
function Open_My_Website() {
    var websiteURL = "https://manpreet-singh-portfolio.netlify.app/";
    var iframe = document.getElementById("embeddedBrowser");
    iframe.src = websiteURL;
    
    // Show the iframe and close button
    document.getElementById("browserContainer").style.display = "block";
    document.getElementById("Closebtn").style.display = "block";
    document.getElementById("My_website").style.display = "block";
}



setInterval(printSystemDateTime, 1000);
printSystemDateTime();