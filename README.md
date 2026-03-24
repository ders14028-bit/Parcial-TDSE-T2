# Parcial-TDSE-T2

Daniel Esteban Rodriguez Suarez

---

First we configure the environment for the exercise
in this case we have the example of the .html

        <!DOCTYPE html>
        <html>
        <head>
        <title>Form Example</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
        <body>
        <h1>Form with GET</h1>
        <form action="/Catalan">
        <label for="value">Value:</label><br>
        <input type="text" id="value" name="value" value="1"><br><br>
        <input type="button" value="Submit" onclick="loadGetMsg()">
        </form>
        <div id="getrespmsg"></div>
        <script>
        function loadGetMsg() {
        let nameVar = document.getElementById("value").value;
        const xhttp = new XMLHttpRequest();
        xhttp.onload = function() {
        document.getElementById("getrespmsg").innerHTML =
        this.responseText;
        }
        xhttp.open("GET", "/Catalan?value="+value);
        xhttp.send();
        }
        </script>
        </body>
        </html>

We have in this html the option of entering one value and returning the list of the output. Like in the expample of the problem of thius part of the exam.

