
    $('#loginForm,#regForm').bootstrapValidator({
        fields: {
            username: {
                validators: {
                    notEmpty: {
                        message: '用户名不能为空.'
                    },
                    stringLength: {
                        min: 3,
                        max: 15,
                        message: '用户名长度应该在4 - 15之间.'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只能包含大写、小写、数字和下划线'
                    },
                    threshold:4,//只有4个字符以上才发送ajax
                    remote: {
                        url: "${ctx}/user/checkNameExists",
                        message: "用户名已经存在",
                        delay: 2000,
                        type: 'POST',
                        cache:false
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空.'
                    },
                    stringLength: {
                        min: 6,
                        max: 15,
                        message: '密码长度应该在6 - 15之间.'
                    }
                }
            }
        }
    });