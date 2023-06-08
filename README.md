#Below is a Unified Modelling Language (UML) diagram of an election class

- candidate : String
- numVotes : int
<<constructor>>+ Election ( )
  
<<constructor>>+ Election (nm : String, nVotes : int)
+ setCandidate( nm : String)
+ setNumVotes( ) : int
  

Using your knowledge of classes, arrays, and array list, write the Java code for the 
UML above in NetBeans. [7 marks]
Write the Java code for the main method in a class called TestElection to do the 
following:
a) Declare an array to store objects of the class defined by the UML above. Use 
a method from the JOptionPane class to request the length of the array from 
the user.
[3 marks]
b) Use a method from the JOptionPane class to request values from the user to 
initialize the instance variables of Election objects and assign these objects to 
the array. The array must be filled.
[5 marks]
c) Determine the total number of votes and the percentage of the total votes 
received by each candidate and the winner of the election. The sample output 
of your program is shown below. Use methods from the System.out stream for 
your output.
