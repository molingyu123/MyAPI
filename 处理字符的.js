//采用正则表达式获取地址栏参数：-- 可以解决请求中包含中文
//请求中文请使用以下方式编码:"xxx.do?name ="+ encodeURIComponent(name);
function getURIParams(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = decodeURIComponent(window.location.search).substr(1).match(reg);
	if(r != null) return unescape(r[2]);
	return null;
}

//采用正则表达式获取地址栏参数：-- 请求中不能包含中文
function getUrlParams(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r != null) return unescape(r[2]);
	return null;
}

//查询某属性值为制定的数组对象
function queryArrObj(_arr,proName,value) {
	var obj = null;
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][proName] == value) {
			obj = _arr[i];
			break;
		}
	}
	return obj;
}

/**
 * //更新数组元素
 * @param {Object} _arr 被修改的数组
 * @param {Object} eqProName 作为比较数组对象的属性名
 * @param {Object} eqValue 作为比较数组对象属性名对应的值
 * @param {Object} upProName 需要修改的属性名
 * @param {Object} upValue 需要修改属性对应的值
 */
function updateArrElement(_arr,eqProName,eqValue,upProName,upValue){
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][eqProName] == eqValue) {
			_arr[i][upProName]=upValue;
			return _arr;
		}
	}
}

//根据属性名对应的值移除对象
function removerArrObjByProName(_arr,proName,value){
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i][proName] == value) {
			if(i == 0) {
				return _arr.shift(); //删除并返回数组的第一个元素
			} else if(i == length - 1) {
				return _arr.pop(); //删除并返回数组的最后一个元素
			} else {
				return _arr.splice(i, 1); //删除下标为i的元素
			}
		}
	}
}

//移除数组对象--根据属性名
function removeArrObjProName(_arr, _obj,proName) {
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i]["'"+proName+"'"] == _obj["'"+proName+"'"]) {
			if(i == 0) {
				_arr.shift(); //删除并返回数组的第一个元素
				return;
			} else if(i == length - 1) {
				_arr.pop(); //删除并返回数组的最后一个元素
				return;
			} else {
				_arr.splice(i, 1); //删除下标为i的元素
				return;
			}
		}
	}
}

//移除数组对象
function removeArrObj(_arr, _obj) {
	var length = _arr.length;
	for(var i = 0; i < length; i++) {
		if(_arr[i] == _obj) {
			if(i == 0) {
				_arr.shift(); //删除并返回数组的第一个元素
				return;
			} else if(i == length - 1) {
				_arr.pop(); //删除并返回数组的最后一个元素
				return;
			} else {
				_arr.splice(i, 1); //删除下标为i的元素
				return;
			}
		}
	}
}