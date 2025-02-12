-- 루시와 엘라 찾기
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE FROM ANIMAL_INS WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')

-- 상위 n개 레코드
SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME LIMIT 1

-- 최댓값 구하기
SELECT DATETIME as '시간' FROM ANIMAL_INS ORDER BY DATETIME DESC LIMIT 1
SELECT MAX(DATETIME) as '시간' FROM ANIMAL_INS

-- 최솟값 구하기
SELECT MIN(DATETIME) as '시간' FROM ANIMAL_INS

-- 동명 동물 수 찾기
SELECT NAME, COUNT(NAME) AS COUNT FROM ANIMAL_INS GROUP BY NAME HAVING COUNT>1 ORDER BY NAME

-- 입양 시각 구하기(1)
SELECT HOUR(DATETIME) AS HOUR, COUNT(DATETIME) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >= 9
  AND HOUR(DATETIME) <= 19
GROUP BY HOUR(DATETIME)
ORDER BY HOUR