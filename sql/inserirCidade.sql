select * from estados

INSERT INTO cidades (nome, area, estado_id)
Values ('Campinas', 795, 25)

insert into cidades (nome, area, estado_id)
Values('Niteroi', 133.9, 19)



insert into cidades 
    (nome, area, estado_id)
values(
   'Caruaru', 
    960.6, 
    (select id from estados where sigla = 'PE')
)

insert into cidades 
    (nome, area, estado_id)
values(
    'Juazeiro do Norte',
    248.2,
    (select id from estados where sigla = 'CE')
    )

SELECT ID FROM CIDADES