**Sales Taxes DEALERON Coding Test**

My code takes in 3 requirements from the user; the product they want, the quantity of the product that they want, and whether or not it will need to be imported from somewhere.

The user can enter any number of items they want at any quantity and once the user is finished adding items a receipt is printed out showing the items selected, the tax, and the total cost for the items.

**My Thought Process**

Originally I was going to allow the user to enter in a single sentence and have a function search through the sentence and pick out the quantity, the product, and whether or not it needed to be imported. 

But after some testing it seemed easier for me as a programmer and for the user, in their decision making, to break these three things up into smaller pieces.

Also when thinking about it from a database perspective if this were in a database these options would probably be pieced out anyways into smaller options rather then clumped together.

**The requirements for the project were as follows:**

There are a variety of items for sale at a store. When a customer purchases items, they receive a receipt. The
receipt lists all of the items purchased, the sales price of each item (with taxes included), the total sales taxes for
all items, and the total sales price.

Basic sales tax applies to all items at a rate of 10% of the item’s list price, with the exception of books, food, and
medical products, which are exempt from basic sales tax. An import duty (import tax) applies to all imported items
at a rate of 5% of the shelf price, with no exceptions.

Write an application that takes input for shopping baskets and returns receipts in the format shown below,
calculating all taxes and totals correctly. When calculating prices plus tax, round the total up to the nearest 5
cents. For example, if a taxable item costs $5.60, an exact 10% tax would be $0.56, and the final price after adding
the rounded tax of $0.60 should be $6.20.