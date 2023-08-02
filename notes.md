**NOTES**

* 200 is a good response code
* the difference between a String and a StringBuilder
  * You need to re-assign a String
  * You can actually append characters to a string

# Try/Catch
* similar to if statements
  * if the try block executes without error, the catch block is skipped
  * if the try block has an error, the try block will execute up until that point
    * the part with the error is skipped and the catch block will execute

# Explaining InfoString

        StringBuilder infoString = new StringBuilder();
        Scanner scan = new Scanner(url.openStream());

        while(scan.hasNext())
          infoString.append(scan.nextLine());
        scan.close();

        System.out.println(infoString);

`.openStream()` - I need a better understanding  
* Stringbuilder is just like a String, except you can actually make edits to the String instead of having to re-assign the String.
* Scanner object to read the data from the get request
* while there is still more data to read
  * append the data into `infoString`
* close Scanner
* see what infoString now looks like


.clone() returns a shallow copy of ArrayList => returns an object, not an ArrayList