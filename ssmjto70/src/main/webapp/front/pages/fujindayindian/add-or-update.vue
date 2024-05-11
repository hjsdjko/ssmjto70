<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">店铺名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.dianpumingcheng" v-model="ruleForm.dianpumingcheng" placeholder="店铺名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">营业时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.yingyeshijian" placeholder="营业时间" @tap="toggleTab('yingyeshijian')"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"160rpx"}' class="cu-form-group" @tap="yingyezhizhaoTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">营业执照</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"120rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"50%","textAlign":"left","height":"120rpx"}' class="avator" v-if="ruleForm.yingyezhizhao" :src="ruleForm.yingyezhizhao" mode="aspectFill"></image>
					<image :style='{"width":"120rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"50%","textAlign":"left","height":"120rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">联系方式</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.lianxifangshi" v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 ","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">打印价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.dayinjiage" v-model="ruleForm.dayinjiage" placeholder="打印价格"></input>
			</view>
																																				
			<!-- 否 -->
 
			
			          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(245, 245, 245, 1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0 0 0 0","borderWidth":"0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"25%","fontSize":"26rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">地址</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"0","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"0","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.dizhi" placeholder="地址"></textarea>
			</view>
						          				          							
			          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(26, 172, 25, 1)","borderColor":"rgba(68, 68, 68, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"90%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

										<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="yingyeshijianConfirm" ref="yingyeshijian" themeColor="#333333"></w-picker>
																								<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="clicktimeConfirm" ref="clicktime" themeColor="#333333"></w-picker>
											
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												dianpumingcheng: '',
																yingyeshijian: '',
																yingyezhizhao: '',
																lianxifangshi: '',
																dayinjiage: '',
																dizhi: '',
																																				},
																																																																								// 登陆用户信息
				user: {},
                                ro:{
                                   dianpumingcheng : false,
                                   yingyeshijian : false,
                                   yingyezhizhao : false,
                                   lianxifangshi : false,
                                   dayinjiage : false,
                                   dizhi : false,
                                   clicktime : false,
                                   clicknum : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																						
																																																									
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`fujindayindian`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='dianpumingcheng'){
					this.ruleForm.dianpumingcheng = obj[o];
					this.ro.dianpumingcheng = true;
					continue;
					}
					if(o=='yingyeshijian'){
					this.ruleForm.yingyeshijian = obj[o];
					this.ro.yingyeshijian = true;
					continue;
					}
					if(o=='yingyezhizhao'){
					this.ruleForm.yingyezhizhao = obj[o];
					this.ro.yingyezhizhao = true;
					continue;
					}
					if(o=='lianxifangshi'){
					this.ruleForm.lianxifangshi = obj[o];
					this.ro.lianxifangshi = true;
					continue;
					}
					if(o=='dayinjiage'){
					this.ruleForm.dayinjiage = obj[o];
					this.ro.dayinjiage = true;
					continue;
					}
					if(o=='dizhi'){
					this.ruleForm.dizhi = obj[o];
					this.ro.dizhi = true;
					continue;
					}
					if(o=='clicktime'){
					this.ruleForm.clicktime = obj[o];
					this.ro.clicktime = true;
					continue;
					}
					if(o=='clicknum'){
					this.ruleForm.clicknum = obj[o];
					this.ro.clicknum = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																						
			// 多级联动参数
																																																						
																																																			
															// 日长控件选择日期时间
			yingyeshijianConfirm(val) {
				console.log(val)
				this.ruleForm.yingyeshijian = val.result;
				this.$forceUpdate();
			},
																																				// 日长控件选择日期时间
			clicktimeConfirm(val) {
				console.log(val)
				this.ruleForm.clicktime = val.result;
				this.$forceUpdate();
			},
												
																																																			
																											yingyezhizhaoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yingyezhizhao = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																						
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																								if(this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
																																if(this.ruleForm.dayinjiage&&(!this.$validate.isIntNumer(this.ruleForm.dayinjiage))){
					this.$utils.msg(`打印价格应输入整数`);
					return
				}
																																																																																																																				if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
																																				if(this.ruleForm.id){
					await this.$api.update(`fujindayindian`, this.ruleForm);
				}else{
					await this.$api.add(`fujindayindian`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 80rpx;
	}
	
	.select .uni-input {
		line-height: 80rpx;
	}
	
	.input .right-input {
		line-height: 80rpx;
	}
</style>
