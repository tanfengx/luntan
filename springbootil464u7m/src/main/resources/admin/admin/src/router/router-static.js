import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import systemintro from '@/views/modules/systemintro/list'
    import discussyouxiutiezi from '@/views/modules/discussyouxiutiezi/list'
    import youxiutiezi from '@/views/modules/youxiutiezi/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import systemnotice from '@/views/modules/systemnotice/list'
    import config from '@/views/modules/config/list'
    import tiezifenlei from '@/views/modules/tiezifenlei/list'
    import yishiwudating from '@/views/modules/yishiwudating/list'
    import forum from '@/views/modules/forum/list'

//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }      ,{
      path: '/yishiwudating',
            name: '遗失物大厅',
            component: yishiwudating
          }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }      ,{
        path: '/forum',
              name: '校园热事讨论',
              component: forum
            }
      ,{
	path: '/discussyouxiutiezi',
        name: '优秀帖子评论',
        component: discussyouxiutiezi
      }
      ,{
	path: '/youxiutiezi',
        name: '优秀帖子',
        component: youxiutiezi
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/systemnotice',
        name: '系统公告',
        component: systemnotice
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/tiezifenlei',
        name: '帖子分类',
        component: tiezifenlei
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
