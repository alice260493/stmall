
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import SearchproductView from "./components/SearchproductView"
import SearchproductViewDetail from "./components/SearchproductViewDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/orders/searchproducts',
                name: 'SearchproductView',
                component: SearchproductView
            },
            {
                path: '/orders/searchproducts/:id',
                name: 'SearchproductViewDetail',
                component: SearchproductViewDetail
            },




    ]
})
