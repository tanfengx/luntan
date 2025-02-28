const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootil464u7m/",
            name: "springbootil464u7m",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootil464u7m/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校论坛"
        } 
    }
}
export default base
