<!DOCTYPE html>
<html>
<head data-suburl="">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	
		<meta name="author" content="coding-556" />
		<meta name="description" content="files" />
		<meta name="keywords" content="慕课网Git,代码托管,Git,Git代码托管,实战课源码">
	
	<meta name="referrer" content="no-referrer-when-downgrade" />
	<meta name="_csrf" content="adT9bfkKvXuGDbygZ0_n7XAVssU6MTY0OTIxODEyMjUwMjI0NjcyNw==" />
	<meta name="_suburl" content="" />
	
	
	
		<meta property="og:url" content="https://git.imooc.com/coding-556/files" />
		<meta property="og:type" content="object" />
		<meta property="og:title" content="coding-556/files">
		<meta property="og:description" content="">
		<meta property="og:image" content="https://git.imooc.com/img/avatar_default.png" />
	
	
	<link rel="shortcut icon" href="/img/favicon.ico" />

	<script src="/js/jquery-1.11.3.min.js"></script>
	<script src="/js/libs/jquery.are-you-sure.js"></script>
	<link rel="stylesheet" href="/assets/font-awesome-4.6.3/css/font-awesome.min.css">
	<link rel="stylesheet" href="/assets/font-imooc/css/font-less.css">
	<link rel="stylesheet" href="/assets/font-imv2/css/style.css">
	<link rel="stylesheet" href="/assets/octicons-4.3.0/octicons.min.css">
	<link rel="stylesheet" href="/js/libs/moco/v1.0/dist/css/moco.min.css?v=1">
	
	

	

	
	<link rel="stylesheet" href="/css/semantic-2.2.13.min.css">
	<link rel="stylesheet" href="/css/gogs.css?v=ffd58de614cbac9361a58ea879831fad">
	<link rel="stylesheet" href="/css/profie.css?v=ffd58de614cbac9361a58ea879831fad">
	
	<script src="/js/semantic-2.2.13.min.js"></script>
	<script src="/js/gogs.js?v=ffd58de614cbac9361a58ea879831fad1"></script>
	<script src="/js/libs/moco/v1.0/dist/js/moco.min.js?v=1"></script>

	
	<script type = "text/javascript">
	(function() {
		window.zhuge = window.zhuge || [];
		window.zhuge.methods = "_init identify track getDid getSid getKey setSuperProperty setUserProperties setWxProperties setPlatform".split(" ");
		window.zhuge.factory = function(b) {
		return function() {
			var a = Array.prototype.slice.call(arguments);
			a.unshift(b);
			window.zhuge.push(a);
			return window.zhuge;
		}
		};
		for (var i = 0; i < window.zhuge.methods.length; i++) {
		var key = window.zhuge.methods[i];
		window.zhuge[key] = window.zhuge.factory(key);
		}
		window.zhuge.load = function(b, x) {
		if (!document.getElementById("zhuge-js")) {
			var a = document.createElement("script");
			var verDate = new Date();
			var verStr = verDate.getFullYear().toString() + verDate.getMonth().toString() + verDate.getDate().toString();

			a.type = "text/javascript";
			a.id = "zhuge-js";
			a.async = !0;
			a.src = (location.protocol == 'http:' ? "http://sdk.zhugeio.com/zhuge.min.js?v=": 'https://zgsdk.zhugeio.com/zhuge.min.js?v=') + verStr;
			a.onerror = function() {
			window.zhuge.identify = window.zhuge.track = function(ename, props, callback) {
				if(callback && Object.prototype.toString.call(callback) === '[object Function]') {
				callback();
				} else if (Object.prototype.toString.call(props) === '[object Function]') {
				props();
				}
			};
			};
			var c = document.getElementsByTagName("script")[0];
			c.parentNode.insertBefore(a, c);

			window.zhuge._init(b, x)
		}
		};
			window.zhuge.load('f375fe2f71e542a4b890d9a620f9fb32', {
				superProperty: {
					'应用名称': '诸葛io'
				},
				debug: false,
				adTrack: false,
				autoTrack: false,
				singlePage: false
			});
	})();
	</script>

	<title>coding-556/files - 慕课网Git</title>

	<meta name="theme-color" content="#ff5343">

	

</head>
<body>
	<div class="full height">
		<noscript>Please enable JavaScript in your browser!</noscript>

		
			<div class="following bar gray">

				<div class="ui container">
					<div class="ui grid">
						<div class="column">
							<div class="ui top secondary menu definemenu">
								<a class="item brand" href="/">
									<img class="ui mini image" src="/img/favicon.png">
								</a>

								
									<a class="item" href="/issues">任务管理</a>
									<a class="item" href="/pulls">合并请求</a>
								

								<a class="item" href="/explore/repos" style="display: none;">发现</a>

								
									<div class="right menu">
									
									
										<div class="ui dropdown head link jump item poping up" data-variation="tiny inverted" style="height: 52px;">
											<span class="text">
												<i class="octicon octicon-plus"><span class="sr-only">创建...</span></i>
												<i class="octicon octicon-triangle-down"></i>
											</span>
											<div class="menu">
												<a class="item" href="/repo/create">
													<i class="octicon octicon-plus"></i> 创建仓库
												</a>
												<a class="item" href="/repo/migrate">
													<i class="octicon octicon-repo-clone"></i> 迁移外部仓库
												</a>
												
												<a class="item" href="/org/create">
													<i class="octicon octicon-organization"></i> 创建新的组织
												</a>
												
											</div>
										</div>
									
										<div class="ui dropdown head link jump item poping up mr0" tabindex="-1" data-variation="tiny inverted">
											<span class="text avatar">
												<img class="ui avatar image" src="//img.mukewang.com/5b8ced80000137dd02000200-100-100.jpg">
												
												<i class="ellipsis vertical icon" tabindex="-1"></i>
											</span>
											<div class="menu" tabindex="-1">
												
												<a class="item" href="/stanhe518">
													<i class="octicon octicon-person"></i>
													个人主页
												</a>
												<a class=" item" href="/user/settings/ssh">
													<i class="octicon octicon-settings"></i>
													用户设置
												</a>
												<a class="item" target="_blank" href="//www.imooc.com/help/cate/27" rel="noreferrer">
													<i class="octicon octicon-question"></i>
													帮助
												</a>
												

												<div class="divider"></div>
												<a  class="item" href="//git.imooc.com/passport/user/logout?referer=//git.imooc.com">
													<i class="octicon octicon-sign-out"></i>
													退出
												</a>
											</div>
										</div>
									</div>

								
							</div>
						</div>
					</div>
				</div>
			</div>
		


<div class="repository file list">
	<div class="header-wrapper">

	<div class="ui container">
		<div class="ui vertically padded grid head">
			<div class="column">
				<div class="ui header">
					<div class="ui huge breadcrumb">
						<i class="mega-octicon octicon-lock"></i>
						<a href="/coding-556">仿哔哩哔哩企业级Springboot后端项目实战</a>
						<div class="divider"> / </div>
						<a href="/coding-556/files">files</a>
						
						
					</div>

					
						<div class="ui right">
							<div class="ui labeled button" tabindex="0">
								<a class="ui basic button" href="/coding-556/files/action/unwatch?redirect_to=%2fcoding-556%2ffiles%2fsrc%2fmaster%2f%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99%2f3%20%e7%ac%ac%e4%b8%89%e7%ab%a0%2f%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae%2fCorsConfig.java">
									<i class="icon fa-eye"></i>取消关注
								</a>
								<a class="ui basic label" href="/coding-556/files/watchers">
									274
								</a>
							</div>
							<div class="ui labeled button" tabindex="0">
								<a class="ui basic button" href="/coding-556/files/action/star?redirect_to=%2fcoding-556%2ffiles%2fsrc%2fmaster%2f%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99%2f3%20%e7%ac%ac%e4%b8%89%e7%ab%a0%2f%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae%2fCorsConfig.java">
									<i class="icon fa-star-o"></i>点赞
								</a>
								<a class="ui basic label" href="/coding-556/files/stars">
									5
								</a>
							</div>
							
								<div class="ui labeled button" tabindex="0">
									<a class="ui basic button " href="/repo/fork/29815">
										<i class="octicon octicon-repo-forked"></i>Fork
									</a>
									<a class="ui basic label" href="/coding-556/files/forks">
										2
									</a>
								</div>
							
						</div>
					
				</div>
			</div>
		</div>
	</div>


	<div class="ui tabs container">
		<div class="ui tabular menu navbar">
			
				<a class="active item" href="/coding-556/files">
					<i class="octicon octicon-file-text"></i> 代码
				</a>
			
			
				<a class=" item" href="/coding-556/files/issues">
					<i class="octicon octicon-issue-opened"></i> Issues <span class="ui small label">0</span>
				</a>
			
			
				<a class=" item" href="/coding-556/files/pulls">
					<i class="octicon octicon-git-pull-request"></i> Pull Requests <span class="ui small label">0</span>
				</a>
			
			
				<a class=" item" href="/coding-556/files/wiki">
					<i class="octicon octicon-book"></i> Wiki
				</a>
			
			
		</div>
	</div>
	<div class="ui tabs divider"></div>

</div>

	<div class="ui container">
		




		<div style="position:relative;width:980px;height:36px;background:#fff9f5;font-size:12px;font-weight:400;font-family:PingFangSC-Regular;border:1px solid #ffd5a1;border-radius:4px;line-height:36px;margin-bottom:26px;color:#e98000;">
			<div style="text-indent:15px;">温馨提示：Git用户名 / &nbsp;Username: stanhe518&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Git密码 / &nbsp;Password: 为慕课网登录密码</div>
			<div style="position:absolute;top:0px;right:17px;font-size:14px;font-weight:400;">
				<a style="color:#f20d0d;" href="https://www.imooc.com/user/newforgot" target="_blank">重置密码</a>
			</div>
		</div>
		
		<div class="ui secondary menu">
			<div class="fitted item choose reference">
	<div class="ui floating filter dropdown" data-no-results="未找到结果">
			<div class="ui basic small button">
			<span class="text">
				<i class="octicon octicon-git-branch"></i>
				分支:
				<strong class="branch_text">master</strong>
			</span>
			<i class="dropdown icon"></i>
		</div>
		<div class="menu">
			<div class="ui icon search input">
				<i class="filter icon"></i>
				<input name="search" placeholder="过滤分支或标签...">
			</div>
			<div class="header">
				<div class="ui grid">
					<div class="two column row">
						<a class="reference column" href="#" data-target="#branch-list">
							<span class="text black">
								分支列表
							</span>
						</a>
						<a class="reference column" href="#" data-target="#tag-list">
							<span class="text ">
								标签列表
							</span>
						</a>
					</div>
				</div>
			</div>
			<div id="branch-list" class="scrolling menu" >
				
					<div class="item selected" data-url="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java">master</div>
				
			</div>
			<div id="tag-list" class="scrolling menu" style="display: none">
				
			</div>
		</div>
	</div>
</div>

			
			<div class="fitted item">
				
				
				
					<div class="ui breadcrumb">
						<a class="section" href="/coding-556/files/src/master">files</a>
						
							<div class="divider"> / </div>
							
								
								<span class="section"><a href="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99">参考资料</a></span>
							
						
							<div class="divider"> / </div>
							
								
								<span class="section"><a href="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0">3 第三章</a></span>
							
						
							<div class="divider"> / </div>
							
								
								<span class="section"><a href="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae">跨域配置</a></span>
							
						
							<div class="divider"> / </div>
							
								<span class="active section">CorsConfig.java</span>
							
						
					</div>
				
			</div>
			<div class="right fitted item">
				
					<div id="file-buttons" class="ui tiny blue buttons">
						
						
					</div>
				

				
					
			</div>
		</div>
		
			<div id="file-content" class="tab-size-8">
	<h4 class="ui top attached header" id="repo-read-file">
		
			<i class="file text outline icon ui left"></i>
			<strong>CorsConfig.java</strong> <span class="text grey normal">2.7 KB</span>
		
		
			<div class="ui right file-actions">
				<div class="ui buttons">
					
						<a class="ui button" href="/coding-556/files/src/48b11251f04b23cd1bdbc5625b2b51848a0e3238/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java">永久链接</a>
					
					<a class="ui button" href="/coding-556/files/commits/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java">文件历史</a>
					<a class="ui button" href="/coding-556/files/raw/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java">原始文件</a>
				</div>
				
					
						<i class="octicon octicon-pencil btn-octicon poping up disabled" data-content="您必须Fork此仓库才能对此文件进行修改操作" data-position="bottom center" data-variation="tiny inverted"></i>
					
					
						<i class="octicon octicon-trashcan btn-octicon poping up disabled" data-content="您必须具有可写权限才能对此文件进行修改操作" data-position="bottom center" data-variation="tiny inverted"></i>
					
				
			</div>
		
	</h4>
	<div class="ui attached table segment">
		<div id="" class="file-view code-view has-emoji">
			
				<table>
					<tbody>
						<tr>
						
							<td class="lines-num"><span id="L1">1</span><span id="L2">2</span><span id="L3">3</span><span id="L4">4</span><span id="L5">5</span><span id="L6">6</span><span id="L7">7</span><span id="L8">8</span><span id="L9">9</span><span id="L10">10</span><span id="L11">11</span><span id="L12">12</span><span id="L13">13</span><span id="L14">14</span><span id="L15">15</span><span id="L16">16</span><span id="L17">17</span><span id="L18">18</span><span id="L19">19</span><span id="L20">20</span><span id="L21">21</span><span id="L22">22</span><span id="L23">23</span><span id="L24">24</span><span id="L25">25</span><span id="L26">26</span><span id="L27">27</span><span id="L28">28</span><span id="L29">29</span><span id="L30">30</span><span id="L31">31</span><span id="L32">32</span><span id="L33">33</span><span id="L34">34</span><span id="L35">35</span><span id="L36">36</span><span id="L37">37</span><span id="L38">38</span><span id="L39">39</span><span id="L40">40</span><span id="L41">41</span><span id="L42">42</span><span id="L43">43</span><span id="L44">44</span><span id="L45">45</span><span id="L46">46</span><span id="L47">47</span><span id="L48">48</span><span id="L49">49</span><span id="L50">50</span><span id="L51">51</span><span id="L52">52</span><span id="L53">53</span><span id="L54">54</span><span id="L55">55</span><span id="L56">56</span><span id="L57">57</span><span id="L58">58</span><span id="L59">59</span><span id="L60">60</span><span id="L61">61</span></td>
							<td class="lines-code"><pre><code class="java"><ol class="linenums"><li class="L1" rel="L1">package 跨域配置;</li>
<li class="L2" rel="L2"></li>
<li class="L3" rel="L3">import org.springframework.context.annotation.Configuration;</li>
<li class="L4" rel="L4"></li>
<li class="L5" rel="L5">import javax.servlet.*;</li>
<li class="L6" rel="L6">import javax.servlet.http.HttpServletRequest;</li>
<li class="L7" rel="L7">import javax.servlet.http.HttpServletResponse;</li>
<li class="L8" rel="L8">import java.io.IOException;</li>
<li class="L9" rel="L9">import java.util.Arrays;</li>
<li class="L10" rel="L10">import java.util.HashSet;</li>
<li class="L11" rel="L11">import java.util.Set;</li>
<li class="L12" rel="L12"></li>
<li class="L13" rel="L13">/**</li>
<li class="L14" rel="L14"> * 跨域解决配置</li>
<li class="L15" rel="L15"> *</li>
<li class="L16" rel="L16"> * 跨域概念：</li>
<li class="L17" rel="L17"> *      出于浏览器的同源策略限制，同源策略会阻止一个域的javascript脚本和另外一个域的内容进行交互。</li>
<li class="L18" rel="L18"> *      所谓同源就是指两个页面具有相同的协议（protocol），主机（host）和端口号（port）</li>
<li class="L19" rel="L19"> *</li>
<li class="L20" rel="L20"> * 非同源的限制：</li>
<li class="L21" rel="L21"> *  【1】无法读取非同源网页的 Cookie、LocalStorage 和 IndexedDB</li>
<li class="L22" rel="L22"> *  【2】无法接触非同源网页的 DOM</li>
<li class="L23" rel="L23"> *  【3】无法向非同源地址发送 AJAX 请求</li>
<li class="L24" rel="L24"> *</li>
<li class="L25" rel="L25"> *  spingboot解决跨域方案：CORS 是跨域资源分享（Cross-Origin Resource Sharing）的缩写。</li>
<li class="L26" rel="L26"> *  它是 W3C 标准，属于跨源 AJAX 请求的根本解决方法。</li>
<li class="L27" rel="L27"> *</li>
<li class="L28" rel="L28"> *</li>
<li class="L29" rel="L29"> *  Filter是用来过滤任务的，既可以被使用在请求资源，也可以是资源响应，或者二者都有</li>
<li class="L30" rel="L30"> *  Filter使用doFilter方法进行过滤</li>
<li class="L31" rel="L31"> */</li>
<li class="L32" rel="L32"></li>
<li class="L33" rel="L33">@Configuration</li>
<li class="L34" rel="L34">public class CorsConfig implements Filter {</li>
<li class="L35" rel="L35"></li>
<li class="L36" rel="L36">    private final String[] allowedDomain = {&#34;http://localhost:8080&#34;, &#34;http://39.107.54.180&#34;};</li>
<li class="L37" rel="L37"></li>
<li class="L38" rel="L38"></li>
<li class="L39" rel="L39">    public void doFilter(ServletRequest request, ServletResponse response,</li>
<li class="L40" rel="L40">                         FilterChain chain) throws IOException, ServletException {</li>
<li class="L41" rel="L41">        HttpServletResponse httpResponse = (HttpServletResponse) response;</li>
<li class="L42" rel="L42">        HttpServletRequest httpRequest = (HttpServletRequest) request;</li>
<li class="L43" rel="L43">        Set&lt;String&gt; allowedOrigins= new HashSet&lt;&gt;(Arrays.asList(allowedDomain));</li>
<li class="L44" rel="L44">        String origin=httpRequest.getHeader(&#34;Origin&#34;);</li>
<li class="L45" rel="L45">        if (origin == null) {</li>
<li class="L46" rel="L46">            chain.doFilter(request, response);</li>
<li class="L47" rel="L47">            return;</li>
<li class="L48" rel="L48">        }</li>
<li class="L49" rel="L49">        if (allowedOrigins.contains(origin)){</li>
<li class="L50" rel="L50">            httpResponse.setHeader(&#34;Access-Control-Allow-Origin&#34;, origin);</li>
<li class="L51" rel="L51">            httpResponse.setContentType(&#34;application/json;charset=UTF-8&#34;);</li>
<li class="L52" rel="L52">            httpResponse.setHeader(&#34;Access-Control-Allow-Methods&#34;, &#34;POST, GET, OPTIONS, DELETE&#34;);</li>
<li class="L53" rel="L53">            httpResponse.setHeader(&#34;Access-Control-Max-Age&#34;, &#34;3600&#34;);</li>
<li class="L54" rel="L54">            httpResponse.setHeader(&#34;Access-Control-Allow-Headers&#34;, &#34;Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With, userId, token, ut&#34;);//表明服务器支持的所有头信息字段</li>
<li class="L55" rel="L55">            httpResponse.setHeader(&#34;Access-Control-Allow-Credentials&#34;, &#34;true&#34;); //如果要把Cookie发到服务器，需要指定Access-Control-Allow-Credentials字段为true;</li>
<li class="L56" rel="L56">            httpResponse.setHeader(&#34;XDomainRequestAllowed&#34;,&#34;1&#34;);</li>
<li class="L57" rel="L57">        }</li>
<li class="L58" rel="L58">        chain.doFilter(request, response);</li>
<li class="L59" rel="L59">    }</li>
<li class="L60" rel="L60">}</li>
<li class="L61" rel="L61"></li>
</ol></code></pre></td>
						
						</tr>
					</tbody>
				</table>
			
		</div>
	</div>
</div>

<script>
function submitDeleteForm() {
    var message = prompt("delete_confirm_message\n\ndelete_commit_summary", "Delete ''");
    if (message != null) {
        $("#delete-message").val(message);
        $("#delete-file-form").submit()
    }
}
</script>

		
	</div>
</div>

	</div>
	
	<div id="J_GotoTop" class="elevator">
		<a href="//www.imooc.com/user/feedback" class="elevator-msg" target="_blank">
			<i class="imv2-feedback"></i>
			<span class="">意见反馈</span>
		</a>
		<a href="//www.imooc.com/help/cate/27" class="elevator-faq" target="_blank">
			<i class="imv2-help icon blue"></i>
			<span class="">帮助中心</span>
		</a>
		
		<a href="javascript:void(0)" class="elevator-weixin no-goto" id="js-elevator-weixin" >
			<i class="imv2-weixigzh"></i>
			<span class="">官方微信</span>
			<div class="elevator-weixin-box"></div>
		</a>
		<a href="javascript:void(0)" class="elevator-top no-goto" style="display:none" id="backTop">
			<i class="imv2-arrow2_u"></i>
			<span class="">返回顶部</span>
		</a>
	</div>
	<footer>
		<div class="ui container">
			<div class="ui left">Copyright © 2018 imooc.com All Rights Reserved | 京ICP备 12003892号-11</div>
			<div class="ui right links">
				<div class="ui language bottom floating upward slide up dropdown link item">
					<i class="world icon"></i>
					<div class="text">简体中文</div>
					<div class="menu">
						
							<a class="item active selected" href="#">简体中文</a>
						
							<a class="item " href="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java?lang=en-US">English</a>
						
							<a class="item " href="/coding-556/files/src/master/%e5%8f%82%e8%80%83%e8%b5%84%e6%96%99/3%20%e7%ac%ac%e4%b8%89%e7%ab%a0/%e8%b7%a8%e5%9f%9f%e9%85%8d%e7%bd%ae/CorsConfig.java?lang=zh-HK">繁體中文</a>
						
					</div>
				</div>
			</div>
		</div>
	</footer>

<script>
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?f0cfcccd7b1393990c78efdeebff3968";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
<script>
(function(){
    var bp = document.createElement('script');
    var curProtocol = window.location.protocol.split(':')[0];
    if (curProtocol === 'https') {
        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';        
    }
    else {
        bp.src = 'http://push.zhanzhang.baidu.com/push.js';
    }
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(bp, s);
})();
</script>


<div style="display: none;">
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?84d74dc9bf9efbc24efce88f71f831cb";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>

</div>
</body>



	<link rel="stylesheet" href="/plugins/highlight-9.6.0/github.css">
	<script src="/plugins/highlight-9.6.0/highlight.pack.js"></script>




<script src="/js/libs/emojify-1.1.0.min.js"></script> 
<script src="/js/libs/clipboard-1.5.9.min.js"></script>

</html>

