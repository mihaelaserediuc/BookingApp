import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Login from '@/components/Login'
import Login2 from '@/components/Login2'
import Login3 from '@/components/Login3'
import Profile from '@/components/Profile'
import Vuelidate from 'vuelidate'
Vue.use(Vuelidate)


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/Login',
      name: 'Login',
      component: Login
    },
    {
      path: '/Login2',
      name: 'Login2',
      component: Login2
    },
    {
      path: '/Login3',
      name: 'Login3',
      component: Login3
    },
    {
      path: '/Profile',
      name: 'Profile',
      component: Profile
    }

  ],
  mode:'history'
})
