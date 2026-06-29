SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE add_numbers(
    a IN NUMBER,
    b IN NUMBER
)
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Sum = ' || (a + b));
END;
/

BEGIN
    add_numbers(15,25);
END;
/