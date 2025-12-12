<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=30&color=00AEEF&center=true&vCenter=true&width=700&lines=Java+Coding+Challenges+%F0%9F%A7%A0;Training+Algorithms+and+Problem+Solving" />
</p>

🧠 Java Coding Challenges – Treinamento de Lógica em Java
<p align="center"> <img src="https://img.shields.io/badge/Java-17-007396?logo=java" /> <img src="https://img.shields.io/badge/Maven-Build-orange?logo=apachemaven" /> <img src="https://img.shields.io/badge/Console%20App-Terminal-blue" /> <img src="https://img.shields.io/badge/Status-Ativo-brightgreen" /> </p>
# Java Coding Challenges

Coleção de desafios de lógica implementados em **Java 17**, executados via linha de comando.

O objetivo deste projeto é praticar fundamentos de programação, algoritmos e organização de código em Java, em um formato de **Coding Challenges** com menu interativo.

---

## 💡 Desafios incluídos

1. **Número Primo** – verificar se um número inteiro positivo é primo  
2. **Fatorial** – calcular o fatorial de um número (0 a 20)  
3. **Palíndromo** – verificar se uma palavra ou frase é um palíndromo  
4. **FizzBuzz** – imprimir a sequência FizzBuzz até N  
5. **Maior Número da Lista** – encontrar o maior número em uma lista informada pelo usuário  

Cada desafio está implementado em uma classe própria dentro do pacote `tasks`, seguindo uma interface comum (`CodingChallenge`).

---

## 🚀 Tecnologias

- Java 17  
- Maven  
- Exec Maven Plugin (`mvn exec:java`)  

---

## 📂 Estrutura do Projeto

```text
java-coding-challenges/
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── rafaelsv
                    └── challenges
                        ├── Main.java
                        ├── menu
                        │   └── MainMenu.java
                        └── tasks
                            ├── CodingChallenge.java
                            ├── PrimeNumberChallenge.java
                            ├── FactorialChallenge.java
                            ├── PalindromeChallenge.java
                            ├── FizzBuzzChallenge.java
                            └── MaxNumberChallenge.java
```

---

## ▶️ Como Rodar

Pré-requisitos:

- Java 17 instalado  
- Maven instalado  

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/SEU_USUARIO/java-coding-challenges.git
cd java-coding-challenges
```

### 2️⃣ Executar o menu de desafios

```bash
mvn exec:java
```

---

## 🖥️ Exemplo de Execução

```text
======================================
         JAVA CODING CHALLENGES
======================================
1 - Verificar se um número é primo
2 - Calcular fatorial de um número
3 - Verificar se uma palavra é palíndromo
4 - FizzBuzz até N
5 - Encontrar o maior número de uma lista
0 - Sair
--------------------------------------
Escolha uma opção:
```

---

## 🔁 Ideias para novos desafios

- Ordenação de lista (Bubble Sort, Insertion Sort)  
- Cálculo de média, mediana e moda  
- Contar frequência de caracteres em uma string  
- Converter número decimal para binário  
- Validar formato de e-mail simples  

---

## 🧑‍💻 Autor: Rafael Dos Santos Vicente.

Projeto criado para estudo e composição de portfólio em Java.

<a href="https://github.com/SEU-USUARIO"> <img src="https://img.shields.io/badge/GitHub-RafaelSV9-000?logo=github" /> </a>

📜 Licença

Projeto sob licença MIT — livre para estudo, modificação e portfólio.
