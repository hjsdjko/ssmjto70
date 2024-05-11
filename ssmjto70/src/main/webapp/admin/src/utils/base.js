const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmjto70/",
            name: "ssmjto70",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmjto70/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序打印室预约"
        } 
    }
}
export default base
