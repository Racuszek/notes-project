  _   _       _        _____ _                 
 | \ | |     | |      / ____| |                
 |  \| | ___ | |_ ___| (___ | |_ ___  _ __ ___ 
 | . ` |/ _ \| __/ _ \\___ \| __/ _ \| '__/ _ \
 | |\  | (_) | ||  __/____) | || (_) | | |  __/
 |_| \_|\___/ \__\___|_____/ \__\___/|_|  \___|
________________________________________________

To run the project successfully, following components are required to be installed and configured:
- MySQL DB https://dev.mysql.com/downloads; a MySQL database 'notes' should be set up with username 'springuser' and password 'Secret'
- Maven https://maven.apache.org/download.cgi
- cURL https://curl.haxx.se/download.html

To add a note: curl localhost:8083/create -d title=note1 -d content=notecontent
To display a note: curl localhost:8083/display/1