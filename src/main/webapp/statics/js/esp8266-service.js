
/**
 * Created by DK on 2018/5/25.
 */

new Vue({
    el: '#esp8266',
    data: {
        sendData:""
    },
    filters:{

    },
    mounted:function(){

    },
    methods: {
        sendDataf:function () {
            let _this=this;
            axios.post('/esp8266/getESP8266Data',
                    {
                        'getESP8266Data': _this.sendData
                    }
                )
        }
    }
})