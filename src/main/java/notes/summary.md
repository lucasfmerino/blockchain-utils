# BLOCKCHAINS THEORY

## Data structure behind blockchains

---

## SHA256 hashing algorithm

---

## Decentralized ledgers

---

## BlockChain mining

**O que é mineração (mining)?**

No contexto do blockchain (como o Bitcoin e outras criptomoedas), mineração é o processo de validar e registrar novas transações na rede. Mineração garante que todas as transações sejam legítimas e adiciona novas "blocos" à cadeia de blocos (blockchain).

Como funciona o processo de mineração?


- Agrupamento de Transações:

Várias transações feitas na rede são reunidas em um bloco. Por exemplo, "Lucas enviou 0.1 BTC para Maria".


- Problema Criptográfico:

Os mineradores competem para resolver um puzzle matemático difícil. Esse puzzle envolve encontrar um número (chamado de nonce) que, ao ser combinado com os dados do bloco e passar por um algoritmo de hash (ex: SHA-256 no Bitcoin), gere um valor que atenda a uma condição específica (como começar com um certo número de zeros).


- Prova de Trabalho (Proof of Work):

Esse processo de adivinhar o nonce é chamado de Proof of Work. Não há como saber o resultado sem tentar várias combinações, e é por isso que mineração exige muito poder computacional.


- Verificação e Consenso:

Assim que um minerador encontra o nonce correto, ele anuncia o bloco para a rede. Outros participantes (nós) verificam se o bloco e o nonce são válidos.


- Recompensa:

O minerador que resolver o puzzle recebe uma recompensa em criptomoedas e todas as taxas das transações incluídas no bloco.


- Adição ao BlockChain:

O bloco é então adicionado ao blockchain, e todas as transações nele se tornam parte oficial do histórico da rede.

---

**Por que mineração é necessária?**

- Segurança: Torna difícil para um atacante alterar um bloco já registrado, pois ele teria que refazer o trabalho de mineração para todos os blocos subsequentes.

- Descentralização: Todos os mineradores competem para validar blocos, eliminando a necessidade de uma autoridade central.

- Emissão de Moeda: No caso de Bitcoin, mineração é o processo pelo qual novos bitcoins são introduzidos na economia.


---

**Por que mineração consome tanta energia?**

A dificuldade dos puzzles aumenta conforme mais mineradores entram na rede, e o número de tentativas necessárias para encontrar um nonce válido pode ser enorme. Isso faz com que a mineração exija hardware poderoso e muita eletricidade.


---

**Diferença entre Proof of Work e Proof of Stake**

- No Proof of Work (PoW), a validação é feita por mineradores resolvendo puzzles matemáticos.
- Já no Proof of Stake (PoS), não há mineração. Os validadores são escolhidos com base na quantidade de moedas que possuem e estão dispostos a "apostar" como garantia de seu comportamento honesto.

---
**Resumo**
Mineração é o processo de:

- Validar transações e criar blocos.
- Resolver um puzzle matemático complexo (Proof of Work).
- Competir para ganhar recompensas e taxas.
- Garantir a segurança e o consenso da rede.

---


## CONSENSUS PROTOCOL

### BYZANTINE GENERALS PROBLEM

### PROOF OF WORK (PoW)

### PROOF OF STAKE (PoS)

## DECENTRALIZED AND DISTRIBUTED NETWORKS

"**BlockChain** (such as Bitcoin) is **distributed** because the users hold a copy of the blockchain itself, 
and it is **decentralized** as no single person or group has control - all users collectively retain control"