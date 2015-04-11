# codecraftsmansaturday

Welcome to ICC, Incremental Calculator Corp.  Today you are going to build the first ever micro-service-based massively-scalable calculator.

__Features__ -- in value rank order:

1. Add two positive integers in the range 0 .. 1e6 and show the result (rudimentary addition function).
2. Add two opposite signed integer numbers and show the result (rudimentary subtraction function).
3. Add two fractional numbers and show the result (full addition and subtraction function, range 1e-6 .. 1e6).
4. Multiply one number by another and show the result.
5. Divide one number by another and show the result.

*Bonus*: Provide the ability to perform all of the above operations when entering and displaying hexadecimal numbers.

__Constraints__ -- ICC's CEO recently subscribed to a trade journal and has been reading up on all the latest trends.  As a result, he has mandated the following constraints:

1. The calculator will be built using the latest Web-based client/server architecture.
2. The calculator must have separated display and data entry means (i.e., the ability to enter numbers and operators must reside on a different computer than the computer that manages the display).
3. Entering a number or operator must inform the display of what's been entered via a RESTful interface and the display must confirm the receipt of anything it is asked to display.
4. Definition-of-done for each feature after the first sprint _must_ include the unit tests and Behavior Driven Development tests.  The tests must assert expected behavior for both success conditions as well as failure handling.
5. Bonuses are offered for each of the following:
    1. the first working demo
    2. the second working demo
    3. the most demos that are accepted
    4. the most complete implementation

