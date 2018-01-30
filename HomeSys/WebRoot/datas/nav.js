var navs = [{
	"title": "个人办公",
	"icon": "fa-circle-o-notch fa-spin",
	"spread": true,
	"children": [{
		"title": "实时房态",
		"icon": "fa-facebook",
		"href": "getRoomList.action"
	}, {
		"title": "账户管理",
		"icon": "&#xe60c;",
		"href": "m_update_pwd.html"
	}, {
		"title": "新建预定",
		"icon": "fa-navicon",
		"href": "getRoomAndRoomType.action"
	}]
}, {
	"title": "收银管理",
	"icon": "fa-refresh fa-spin",
	"spread": false,
	"children": [{
		"title": "交押金",
		"icon": "fa-navicon",
		"href": "m_gonggao.html"
	}, {
		"title": "结账退房",
		"icon": "fa-navicon",
		"href": "m_viewgonggao.html"
	},{
		"title": "转账",
		"icon": "fa-navicon",
		"href": "m_shenhe.html"
		}]
}, {
	"title": "基本设置",
	"icon": "fa-cog fa-spin",
	"spread": false,
	"children": [{
		"title": "楼层设置",
		"icon": "fa-check-square-o",
		"href": "./queryAllPosition?num=1.action"
	},{
		"title": "房号设置",
		"icon": "fa-check-square-o",
		"href": "./queryRoomAction.action"
		},{
		"title": "房价代码",
		"icon": "fa-check-square-o",
		"href": "./queryPriceAction.action"
		},{
		"title": "房价设置",
		"icon": "fa-check-square-o",
		"href": "./queryAllRoom?num=1.action"
		},{
			"title": "房型设置",
		"icon": "fa-check-square-o",
		"href": "./queryTypeInfo?num=1.action",
			}]
}];