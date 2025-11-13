# 🏢 Sistema de Cálculo de Salários – TechCorp Solutions

Sistema desenvolvido na **TechCorp Solutions**, sob orientação do **setor de Desenvolvimento de Software**, com o objetivo de **praticar Programação Orientada a Objetos (POO)** utilizando **Java**, aplicando conceitos de **herança, abstração e polimorfismo** em um cenário corporativo realista.

---

## 🎯 Objetivo

Desenvolver um **sistema automatizado de cálculo de salários** para o setor de **Recursos Humanos (RH)** da TechCorp Solutions, que está em plena expansão e necessita de uma ferramenta eficiente para gerenciar diferentes tipos de colaboradores.

O sistema deve permitir:

- Cadastro de funcionários de diferentes cargos;
- Cálculo automático de salários conforme as regras específicas de cada cargo;
- Exibição da lista de colaboradores com seus respectivos salários.

### 💵 Regras de Remuneração

Cada tipo de funcionário possui critérios distintos de pagamento:

- **Desenvolvedores** → Recebem **salário fixo + bônus por projeto entregue**;
- **Gerentes** → Possuem **salário base + bônus de desempenho**;
- **Estagiários** → Recebem **bolsa equivalente a 80% do salário base**.

O projeto visa consolidar o uso de **classes abstratas e polimorfismo**, permitindo que o método `calcularSalario()` seja chamado de forma dinâmica, conforme o tipo de funcionário.

---

## 💻 Tecnologias Utilizadas

- ☕ **Java** → Linguagem principal de desenvolvimento  
- 🧩 **Programação Orientada a Objetos (POO)** → Uso de **herança**, **abstração**, **encapsulamento** e **polimorfismo**  
- 🧠 **IntelliJ IDEA** → IDE utilizada para implementação e testes  

---

## 🛠 Funcionalidades

### 👤 Cadastrar Funcionário  
Permite registrar novos colaboradores, informando nome, cargo e salário base.

### 💰 Calcular Salário  
Aplica automaticamente as regras específicas de cada tipo de funcionário, utilizando o polimorfismo para determinar o cálculo correto.

### 📋 Listar Funcionários  
Exibe todos os colaboradores cadastrados com seus salários calculados.

---

## 📝 Estrutura do Projeto

src/
├── Funcionario.java # Classe abstrata que define atributos e comportamentos comuns
├── Desenvolvedor.java # Implementa cálculo com bônus por projeto entregue
├── Gerente.java # Implementa cálculo com bônus de desempenho
├── Estagiario.java # Calcula bolsa equivalente a 80% do salário base
└── Main.java # Classe principal para execução do sistema

---

## 👨‍🏫 Orientação

Projeto realizado sob orientação do **Prof. Marcell Philippe** no **SENAI – CTTI**, como atividade prática do curso de Programação de Aplicativos.

---

## 📌 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/MarkossCod/Gestao_de_Funcionarios_de_uma_Empresa.git
