# JAVA-RMI-Client-Server-communication

This is an assignment based on Distributed Systems lecture.
A Client-Server application implemented with Java RMI where you can book or edit your booking in a theatre.
Server is giving you these choices of seats and you pcan make your booking:
1. 100 ZA type seats (Square - Zone A) which cost 45 Euros each.
2. 200 ZB type seats (Square - Zone B) which cost 35 Euros each.
3. 400 ZC type seats (Square - Zone C) which cost 25 Euros each.
4. 225 CE type seats (Central Outsider) which cost 30 Euros each.
5. 75 SD type positions (Side Theory) that cost 20 Euros each.

<h2>Choices</h2>

1. Input ```java Client list Theater``` and press **Enter**. Price catalog will be shown.
2. Input ```java Client book Theater ZA 1 Aggelos``` and press **Enter**. It will book your desired seat.
3. Input ```Client guest Theater Input``` and press **Enter**. It will show all current bookings.
4. Input ```java Client cancel Theater ZA 1 Aggelos``` and press **Enter**. It will cancel the current booking.

<h2>How to run</h2>

1. Save all files in the same folder.
2. Open a terminal directed in the folder.
3. Input ```javac *.java``` and press **Enter** (Will compile all java files).
4. Input ```rmic Server``` and press **Enter**  (Will activate the RMI Server).
6. Input ```rmiregistry & ``` and press **Enter** (Will activate a rmi registry).
7. Input ```java Server &``` and press **Enter**  (Will start the RMI Server).
8. Input ```java Cient``` and press **Enter**  (Will start the RMI Client).

<h2>Photos</h2>

![image](https://github.com/Mantzclb/Java-RMI-Client-Server-/assets/119366289/d96139b4-57ee-489b-ae41-c56d19728c08)

![image](https://github.com/Mantzclb/Java-RMI-Client-Server-/assets/119366289/1478c745-7fa2-4cdf-9007-15274790525e)

After successfull booking, available seats will get reduced by 1

![image](https://github.com/Mantzclb/Java-RMI-Client-Server-/assets/119366289/ffe3fb73-d8e0-4dd6-ba59-0a14b2657186)
