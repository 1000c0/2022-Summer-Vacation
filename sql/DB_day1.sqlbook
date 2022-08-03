-- SQLBook: Code
--2.24
SELECT SKU, SKU_Description
FROM INVENTORY
WHERE QuantityOnHand = 0;
-- SQLBook: Code
--2.25
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand = 0
ORDER BY WarehouseID ASC;
-- SQLBook: Code
--2.26
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand > 0
ORDER BY WaerhouseID DESC, SKU ASC;
-- SQLBook: Code
--2.27
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand = 0 AND QuantityOnOrder > 0
ORDER BY WarehouseID DESC, SKU ASC;
-- SQLBook: Code
--2.28
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand = 0 OR QuantityOnOrder = 0
ORDER BY WarehouseID DESC, SKU ASC;
-- SQLBook: Code
--2.29
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM INVENTORY
WHERE QuantityOnHand > 1 AND QuantityOnHand < 10
-- SQLBook: Code
--2.30
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM INVENTORY
WHERE QuantityOnHand BETWEEN 2 AND 9;
-- SQLBook: Code
--2.31
SELECT SKU, SKU_Description
FROM INVENTORY
WHERE SKU_Description LIKE "Half-Dome%";
-- SQLBook: Code
--2.32
SELECT SKU, SKU_Description
FROM INVENTORY
WHERE SKU_Description LIKE "%climb%";
-- SQLBook: Code
--2.33
SELECT SKU, SKU_Description
FROM Inventory
WHERE SKU_Description LIKE "__d";
-- SQLBook: Code
--2.34
SELECT SUM(QuantityOnHand) AS QuantityOnHandSum,
AVG(QuantityOnHand) AS QuantityOnHandAvg,
MIN(QuantityOnHand) AS QuantityOnHandMin,
MAX(QuantityOnHand) AS QuantityOnHandMax,
COUNT(QuantityOnHand) AS QuantityOnHandCount
FROM INVENTORY;
-- SQLBook: Code
--2.35
-- Count is just check number of object
-- Sum is add number
-- SQLBook: Code
--2.36
SELECT WarehouseID, SUM(QuantityOnHand) AS TotalItemsOnHand
FROM inventory
GROUP BY WarehouseID
ORDER BY TotalItemsOnHand DESC;
-- SQLBook: Code
--2.37
SELECT WarehouseId, SUM(QuantityOnHand) AS TotalItemsOnHandT3
FROM Inventory
GROUP BY WarehouseID
HAVING TotalItemsOnHandT3 = 3
ORDER BY TotalItemsOnHandT3 DESC;
-- SQLBook: Code
--2.38
SELECT WarehouseID, SUM(QuantityOnHand) AS TotalItemsOnHandT3
FROM Inventory
WHERE SKU <
GROUP BY WarhouseID
HAVING TotalItemsOnHandT3 = 3 AND 