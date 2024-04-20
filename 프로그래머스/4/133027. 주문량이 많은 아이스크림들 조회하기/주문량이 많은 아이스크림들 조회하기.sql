-- 코드를 입력하세요
SELECT
A.FLAVOR
FROM FIRST_HALF A
LEFT JOIN JULY B ON A.FLAVOR = B.FLAVOR
GROUP BY A.FLAVOR
ORDER BY SUM(A.TOTAL_ORDER + COALESCE(B.TOTAL_ORDER, 0)) DESC
LIMIT 3;