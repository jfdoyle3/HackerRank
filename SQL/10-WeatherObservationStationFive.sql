SELECT city, LENGTH(city) AS smallestname
FROM station
ORDER BY LENGTH(city) ASC, city ASC
LIMIT 1;

SELECT city, LENGTH(city) AS longestnamw
FROM station
ORDER BY LENGTH(city) DESC, city ASC
LIMIT 1;