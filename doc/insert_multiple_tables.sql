
with primeiro as(
INSERT INTO public.contato (numero,tipo)
	VALUES ('121212','cel')
	returning id
),
segundo as (
INSERT INTO public.endereco (id,logradouro,numero,cep,bairro,cidade,estado)
	VALUES ((select id from primeiro),'rua a','223','080808','jd s','sao','so')
		returning id 
)
INSERT INTO public.clientes (contato,endereco,nome,usuario,senha,email,depoimento,cpf)
	VALUES ((select id from primeiro),(select id from segundo),'Fabio','fab','123','fab@','nada','123');


