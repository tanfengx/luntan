<template>
<div class="home-preview" :style='{"margin":"0px auto","flexWrap":"wrap","flexDirection":"column","background":"none","display":"flex","width":"100%","justifyContent":"center"}'>

	<!-- 搜索 -->
	<div id="search" class="search animate__animated" :style='{"padding":"10px 7% 0","margin":"0 0 10px","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"flex-end","height":"auto"}'>
		<div :style='{"margin":"0 10px 0 0"}' class="select">
			<el-select v-model="queryIndex">
				<el-option
				  v-for="(item,index) in queryList"
				  :key="index"
				  :label="item.queryName"
				  :value="index"
				></el-option>
			</el-select>
		</div>
		<div :style='{"margin":"0 10px 0 0"}' class="input" v-if="queryIndex==0">
			<el-input v-model="youxiutiezitiezibiaoti" placeholder="帖子标题"></el-input>
		</div>
		<div :style='{"margin":"0"}' class="btn" v-if="queryIndex==0">
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#F5BB00","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="primary" @click="search('youxiutiezi')">
				<span class="icon iconfont icon-fangdajing07" :style='{"color":"rgba(255, 255, 255, 1)","margin":"0 4px 0 0","fontSize":"14px"}'></span>
				搜索
			</el-button>
		</div>
	</div>
	<!-- 搜索 -->



		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"30px 7% 20px","margin":"20px auto 0","flexWrap":"wrap","background":"#f1f1f1","display":"flex","width":"100%","height":"auto","order":"5"}'>
		  <div :style='{"width":"100%","lineHeight":"56px","fontSize":"32px","color":"#F5BB00","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center bottom"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0 0 30px","lineHeight":"1.5","fontSize":"26px","color":"#C5C5C5","textAlign":"center"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"width":"48%","padding":"0 0px","flexWrap":"wrap","display":"flex","height":"320px","order":"2"}'>
		    <img :style='{"width":"100%","margin":"0 10px","objectFit":"cover","borderRadius":"6px","display":"block","height":"100%"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"0px","margin":"0 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","width":"48%","lineHeight":"24px","fontSize":"16px","textIndent":"2em","height":"320px"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","cursor":"pointer","margin":"20px auto","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px","order":"3"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"color":"#f5f5f5","fontSize":"14px"}'>点击查看</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"12px"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		


<!-- 商品推荐 -->
<div id="animate_recommendyouxiutiezi" class="recommend animate__animated" :style='{"width":"100%","padding":"20px 0","margin":"0 0 20px","background":"#f1f1f1","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
		<span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>优秀帖子推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	



	<div v-if="youxiutieziRecommend.length" class="list list12 index-pv1 list12youxiutiezi" :style='{"width":"100%","padding":"0 7%","background":"none","height":"auto"}'>
	  <div class="tab" :style='{"width":"100%","margin":"0 0 20px","justifyContent":"center","display":"flex","height":"auto"}'>
	    <template v-for="item,index in recommendList12youxiutiezi">
		<div v-if="index < 6" @click="recommendIndexClick12(index + 1, 'youxiutiezi')" class="item" :class="index + 1 == recommendIndex12youxiutiezi ? 'active' : ''">
			<img v-if="item.image" :style='{"width":"34px","margin":"10px 5px 0 0","objectFit":"cover","borderRadius":"4px","display":"block","height":"34px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
			<div :style='{"color":"inherit","fontSize":"14px"}'>{{item[recommendColumn12youxiutiezi]}}</div>
		</div>
		</template>
		<div class="more" @click="moreBtn('youxiutiezi')">
		  <div :style='{"color":"inherit","fontSize":"14px"}'>更多</div>
		  <span class="icon iconfont icon-jiantou25" :style='{"color":"inherit","margin":"0 0 0 2px","fontSize":"14px"}'></span>
		</div>
	  </div>
	  <div class="list" :style='{"margin":"30px 0 0","overflow":"hidden","flexWrap":"wrap","flex":"1","background":"none","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in youxiutieziRecommend" :key="index" @click="toDetail('youxiutieziDetail', item)">
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","borderRadius":"6px","display":"block","height":"280px"}' v-if="preHttp(item.fengmiantupian)" :src="item.fengmiantupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","borderRadius":"6px","display":"block","height":"280px"}' v-else :src="baseUrl + (item.fengmiantupian?item.fengmiantupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","margin":"0 0 6px","whiteSpace":"nowrap","color":"#333","overflow":"hidden","borderRadius":"6px","borderWidth":"0 0 1px","background":"#fff","width":"100%","lineHeight":"36px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.tiezibiaoti}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","margin":"0 0 6px","whiteSpace":"nowrap","color":"#333","overflow":"hidden","borderRadius":"6px","borderWidth":"0 0 1px","background":"#fff","width":"100%","lineHeight":"36px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.tiezifenlei}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","margin":"0 0 6px","whiteSpace":"nowrap","color":"#333","overflow":"hidden","borderRadius":"6px","borderWidth":"0 0 1px","background":"#fff","width":"100%","lineHeight":"36px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.nicheng}}</div>
	    </div>
	  </div>
	</div>




	
	<div @click="moreBtn('youxiutiezi')" :style='{"border":"0","cursor":"pointer","margin":"0px auto 20px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        systemIntroductionDetail: {},
        queryList:[
          {
              queryName:"帖子标题",
          },
        ],
        queryIndex: 0,
        youxiutiezitiezibiaoti: '',
        newsList: [],
        youxiutieziRecommend: [],



		recommendIndex12youxiutiezi: 0,
		recommendList12youxiutiezi: [],
		recommendColumn12youxiutiezi: '',


      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getSystemIntroduction();
		this.getList();
		this.youxiutieziRecommendCate()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		youxiutieziRecommendCate(){
			this.$http.get('tiezifenlei/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList12youxiutiezi = res.data.data.list
			  }
			});
			this.recommendColumn12youxiutiezi = 'tiezifenlei'
		},
		recommendIndexClick12(index, name) {
			this['recommendIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},

		listIndexClick11(index, name) {
			this['listIndex11' + name] = index[this['listColumn11' + name]]
			this.getList()
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__bounce'},
				{id:'about',css:'animate__fadeInUp'},
				{id:'system',css:'animate__fadeInUp'},
				{id:'animate_recommendyouxiutiezi',css:'animate__fadeInUp'},
				{id:'msgs',css:'animate__bounce'},
				{id:'friendly',css:'animate__bounce'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
      search(tablename) {
        if (this.queryIndex == 0 && this.youxiutiezitiezibiaoti) {
          this.$router.push({path: '/index/' + tablename, query: {indexQueryCondition: this.youxiutiezitiezibiaoti}});
        }
      },
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "youxiutiezi/autoSort";
			data = {
				page: 1,
				limit: 6,
			}
			data['sfsh'] = '是'
			if(this.recommendIndex12youxiutiezi != 0){
				data.tiezifenlei = this.recommendList12youxiutiezi[this.recommendIndex12youxiutiezi - 1].tiezifenlei
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.youxiutieziRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 36px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 36px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.01) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	







	.home-preview .recommend .list12 .tab .item {
				cursor: pointer;
				border: 0;
				border-radius: 6px;
				padding: 0 20px;
				margin: 0 10px;
				color: #fff;
				background: #333;
				width: auto;
				font-size: 16px;
				line-height: 40px;
			}
	
	.home-preview .recommend .list12 .tab .item:hover {
				color: #fff;
				background: #F5BB00;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .item.active {
				color: #fff;
				background: #F5BB00;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .more {
				cursor: pointer;
				padding: 5px 10px;
				margin: 0 10px;
				color: #666;
				background: #fff;
				display: none;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .more:hover {
				color: red;
			}
	
	.home-preview .recommend .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}



</style>
