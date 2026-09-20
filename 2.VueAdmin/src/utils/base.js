const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootipi25y92/",
            name: "springbootipi25y92",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootipi25y92/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的任务打卡系统"
        } 
    }
}
export default base
