<script setup lang="ts">
import { RouterLink } from 'vue-router'
import '@/assets/styles/navbar.css'
</script>

<template>
  <nav class="navbar">
    <RouterLink class="btnNav btnEstoque" to="/estoque">Estoque</RouterLink>
    <RouterLink class="btnNav btnGerenciamento" to="/gerenciamento">Gerenciamento</RouterLink>
    <RouterLink class="btnNav btnReserva" to="/reserva">Reserva</RouterLink>
  </nav>
</template>
