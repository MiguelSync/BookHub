import { createRouter, createWebHistory } from 'vue-router'

import EstoqueView from '@/views/EstoqueView.vue'
import GerenciamentoView from '@/views/GerenciamentoView.vue'
import ReservaView from '@/views/ReservaView.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: '/estoque', component: EstoqueView },
    { path: '/gerenciamento', component: GerenciamentoView },
    { path: '/reserva', component: ReservaView }
  ]
})

export default router
