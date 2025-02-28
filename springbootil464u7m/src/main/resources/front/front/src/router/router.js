import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import payList from '../pages/pay'

import huiyuanList from '../pages/huiyuan/list'
import huiyuanDetail from '../pages/huiyuan/detail'
import huiyuanAdd from '../pages/huiyuan/add'
import tiezifenleiList from '../pages/tiezifenlei/list'
import tiezifenleiDetail from '../pages/tiezifenlei/detail'
import tiezifenleiAdd from '../pages/tiezifenlei/add'
import youxiutieziList from '../pages/youxiutiezi/list'
import youxiutieziDetail from '../pages/youxiutiezi/detail'
import youxiutieziAdd from '../pages/youxiutiezi/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import systemnoticeList from '../pages/systemnotice/list'
import systemnoticeDetail from '../pages/systemnotice/detail'
import systemnoticeAdd from '../pages/systemnotice/add'
import discussyouxiutieziList from '../pages/discussyouxiutiezi/list'
import discussyouxiutieziDetail from '../pages/discussyouxiutiezi/detail'
import discussyouxiutieziAdd from '../pages/discussyouxiutiezi/add'


import yishiwudatingList from '../pages/yishiwudating/list'
import yishiwudatingDetail from '../pages/yishiwudating/detail'
import yishiwudatingAdd from '../pages/yishiwudating/add'


import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'huiyuan',
					component: huiyuanList
				},
				{
					path: 'huiyuanDetail',
					component: huiyuanDetail
				},
				{
					path: 'huiyuanAdd',
					component: huiyuanAdd
				},				{
					path: 'yishiwudating',
					component: yishiwudatingList
				},
				{
					path: 'yishiwudatingDetail',
					component: yishiwudatingDetail
				},
				{
					path: 'yishiwudatingAdd',
					component: yishiwudatingAdd
				},
				{
					path: 'tiezifenlei',
					component: tiezifenleiList
				},
				{
					path: 'tiezifenleiDetail',
					component: tiezifenleiDetail
				},
				{
					path: 'tiezifenleiAdd',
					component: tiezifenleiAdd
				},
				{
					path: 'youxiutiezi',
					component: youxiutieziList
				},				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'youxiutieziDetail',
					component: youxiutieziDetail
				},
				{
					path: 'youxiutieziAdd',
					component: youxiutieziAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'systemnotice',
					component: systemnoticeList
				},
				{
					path: 'systemnoticeDetail',
					component: systemnoticeDetail
				},
				{
					path: 'systemnoticeAdd',
					component: systemnoticeAdd
				},
				{
					path: 'discussyouxiutiezi',
					component: discussyouxiutieziList
				},
				{
					path: 'discussyouxiutieziDetail',
					component: discussyouxiutieziDetail
				},
				{
					path: 'discussyouxiutieziAdd',
					component: discussyouxiutieziAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
