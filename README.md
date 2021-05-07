# Challenge Questions Shopify
#Written in Java 8 with Eclipse.

Question 1: Given some sample data, write a program to answer the following: click here to access the required data set

On Shopify, we have exactly 100 sneaker shops, and each of these shops sells only one model of shoe. We want to do some analysis of the average order value (AOV). When we look at orders data over a 30 day window, we naively calculate an AOV of $3145.13. Given that we know these shops are selling sneakers, a relatively affordable item, something seems wrong with our analysis. 

a.	Think about what could be going wrong with our calculation. Think about a better way to evaluate this data.

The reason being for the wrong calculation you are counting the number of rows (In this case it would be 5000 rows.). I even theory tested it to be precise about the answer. 
So you the error is you would take the total order amount and divided it by the total amounts of rows in this case it would end up being 3145 as the answer.

b.	What metric would you report for this dataset?

In my case for Java I would take the data and parse through it and convert them to a object, further more I would then add the data to a arraylist. After wards I will take the arraylist and use a for loop to parse through each object to get the total amount of items + order amounts. Then I would divide the order amount (15725640) divided by the total items within each column (43936 items)

c.	What is its value? 357

Question 2: For this question you’ll need to use SQL. Follow this link to access the data set required for the challenge. Please use queries to answer the following questions. Paste your queries along with your final numerical answers below.


a.	How many orders were shipped by Speedy Express in total?

The process behind this question is of course what shipper do we need to find? In this case it’s speedy express. But on top of that I needed to count the amount of orders that were also shipped so I already know there is two tables involved (Shippers and Orders). So what I did is I selected from the Orders table and Counted the orders and natural joined it to the Shippers table and found where the shippers name was equal to ‘Speedy Express’

54

SELECT ShipperName, COUNT(*) FROM Orders NATURAL JOIN Shippers WHERE ShipperName = 'Speedy Express';
        
b.	What is the last name of the employee with the most orders?

I needed the last name however I also needed to count the total amount of orders that employee made by then I was already able to confirm two tables were involved (Orders and the Employees table) I used natural join to join them together I further grouped them by their employees ID and then ordered the total in descending order (total is the alias for my count.)

Answer: Peacock with the total being 40

SELECT Lastname, COUNT(*) total FROM Orders NATURAL JOIN Employees GROUP by EmployeeID ORDER BY total DESC
        
c.	What product was ordered the most by customers in Germany?

This question was a bit more challenging I will admit, however my idea is to narrow down the amount of tables I would need for this question. In this case I needed the Orders, Customers, OrderDetails and products table.
I first selected the product name, I got the sum of the quantitys so that I could get the TOTAL as count would completely give me the wrong answer I was wanting. I natural joined the tables together like so Customers> Orders > OrderDetails > Products and found which tables had a relationship to each other and worked my way around. Now that I had all the tables linked I needed to find where the country was equal to Germany and group them by their productID to avoid any combined values. Lastly, I wanted to see the descending value with the alias of my sum quantity which in this case was totalOrderQuant. This gave me the highest value and the product name.

Answer: Boston Crab Meat with the total order quantitys being 160.

SELECT productname, SUM(quantity) totalOrderQuant FROM Customers
NATURAL join Orders 
NATURAL join orderdetails 
NATURAL join products 
WHERE country = 'Germany'
GROUP BY ProductID
ORDER BY totalOrderQuant DESC
