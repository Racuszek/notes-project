To run the project successfully, following components are required to be installed and configured:
- MySQL DB https://dev.mysql.com/downloads; a MySQL database 'notes' should be set up with username 'springuser' and password 'Secret'
- Maven https://maven.apache.org/download.cgi
- cURL https://curl.haxx.se/download.html

To add a note: curl localhost:8083/create -d title=note1 -d content=notecontent
To display a note: curl localhost:8083/display/1
