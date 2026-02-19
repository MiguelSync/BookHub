<script setup lang="ts">
import Navbar from '@/components/Navbar.vue'
import '@/assets/styles/layout.css'
</script>

<template>
  <div class="layout">
    <Navbar />
    <main>
      <RouterView />
    </main>
  </div>
</template>
