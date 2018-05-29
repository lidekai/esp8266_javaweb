/**
 * Created by a2665 on 2018/2/7.
 */
new Vue({
    el:"#test",
    data:{
        test:"你好！"
    },
    filters:{

    },
    mounted: function(){
        this.$nextTick(function () {
            axios.get('getTest')
                .then(function (response) {
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        })
    },
    methods:{
    }
});