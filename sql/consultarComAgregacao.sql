select 
    regiao as 'Regiao',
    sum(populacao) as Total
from estados
group by regiao
order by Total desc

select 
    sum(populacao) as Total
from estados

select
    nome as 'estados do brasil',
    sum(populacao) as Total
from estados
group by nome
order by Total desc


select 
    avg (populacao) as total
from estados

