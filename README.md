#  CalculadoraPintura ------ 4261213239

Este projeto é um sistema desenvolvido em **Java** como parte das atividades de **Lógica de Programação**.  
O objetivo é automatizar o cálculo de materiais para uma empresa de reformas, focando especificamente na metragem de paredes e consumo de tinta.

---

##  Sobre o Desafio

O programa calcula a quantidade de tinta necessária para pintar um **quarto perfeitamente quadrado**, seguindo as premissas:

-  Altura padrão do teto: **2,70 metros**
-  Desconto técnico: **10% da área total** (vãos de portas e janelas)
-  Rendimento da tinta: **1 litro para cada 10 m²**

---

##  Funcionalidades

- Recebe a medida de um dos lados do quarto (entrada do usuário)
- Calcula a área bruta das quatro paredes
- Aplica automaticamente o desconto de vãos
- Calcula e exibe a litragem necessária de tinta

---

##  Lógica de Cálculo

### 1. Área de uma parede

Área_parede = l × 2,70


### 2. Área total (4 paredes)

Área_total = Área_parede × 4


### 3. Aplicação do desconto de 10%

Área_desconto = Área_total × 0,90


### 4. Cálculo da quantidade de tinta

Litros = Área_desconto / 10
