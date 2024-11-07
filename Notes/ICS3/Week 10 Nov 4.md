#files
To create a file and write data to it in Java, we have to use two classes:
- PrinterWriter - Writes data to a file
- FileWriter - Helps creating and organizing data in files

**Writing to a file**
To set up printwriter just do the same thing as scanner. Also pass in `new FileWriter` when creating a new printwriter. always use a try/catch. Then, another argument is true/false. True appends text and false overrides text.

To print text to it just do `p.println(text goes here)`. p is the variable of your printwriter file that you have opened. Make sure to close the file to save your information

**Reading a file**
First create file and scanner variables. Then create an instance of file and pass the file name into the constructor. Create a scanner instance and pass the instance of file that you made.  

Remember to put it in a try catch block.

To read every line in a file, just `while (fReader.hasNextLine())` since this will make it read every line. 

Remember to close

You should read the entire file into an array if the file has a large amount of data. 