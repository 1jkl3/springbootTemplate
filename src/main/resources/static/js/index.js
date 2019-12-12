new Vue({
    el:"#app",
    data:{
        msg:"我爱吃饭"
    },
    methods:{

    },
    mounted:{
        window.addEventListener("runmadr",this.run)
    },
    computed:{
        run(){

        }
    }
})