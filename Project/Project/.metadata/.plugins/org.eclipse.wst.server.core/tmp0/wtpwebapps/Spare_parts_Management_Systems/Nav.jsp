
   <% String userRole = (String) session.getAttribute("userRole"); %>
    <div class="sidebar" id="sidebar">
        <h5 class="text-center fw-bold">
            <%= userRole != null ? userRole + " Panel" : "Panel" %>
        </h5>
        
        
        <% if ("Cashier".equals(userRole)) { %>

    
            
             <a href="${pageContext.request.contextPath}/cashier">
           		 <i class="fas fa-cash-register me-2"></i> Cashier
        	</a>
            
        <% } %>
        
        <% if ( "Stock Manager".equals(userRole)) { %>

    
            
             <a href="${pageContext.request.contextPath}/cashier">
            <i class="fas fa-cash-register me-2"></i> Cashier
        	</a>
            
             <a href="${pageContext.request.contextPath}/order-management">
                <i class="fas fa-shopping-cart me-2"></i> Order Management
            </a>

            <a href="${pageContext.request.contextPath}/item-list">
                <i class="fas fa-box me-2"></i> Item Management
            </a>
            
    
            
            
        <% } %>
        
        <% if ( "Admin".equals(userRole)) { %>

    
            
             <a href="${pageContext.request.contextPath}/cashier">
            <i class="fas fa-cash-register me-2"></i> Cashier
        	</a>
            
             <a href="${pageContext.request.contextPath}/order-management">
                <i class="fas fa-shopping-cart me-2"></i> Order Management
            </a>

            <a href="${pageContext.request.contextPath}/item-list">
                <i class="fas fa-box me-2"></i> Item Management
            </a>
            
            <a href="${pageContext.request.contextPath}/supplier-list">
                <i class="fas fa-truck me-2"></i> Supplier Management
            </a>
            
            <a href="${pageContext.request.contextPath}/GetAllServlet">
                <i class="fas fa-users me-2"></i> User Management
            </a>
            
            
            
        <% } %>
        
        <% if ( "Manager".equals(userRole)) { %>

            <a href="${pageContext.request.contextPath}/dashboard">
                <i class="fas fa-chart-line me-2"></i> Dashboard
            </a>
            
             <a href="${pageContext.request.contextPath}/cashier">
            <i class="fas fa-cash-register me-2"></i> Cashier
        	</a>
            
             <a href="${pageContext.request.contextPath}/order-management">
                <i class="fas fa-shopping-cart me-2"></i> Order Management
            </a>

            <a href="${pageContext.request.contextPath}/item-list">
                <i class="fas fa-box me-2"></i> Item Management
            </a>
            
            <a href="${pageContext.request.contextPath}/supplier-list">
                <i class="fas fa-truck me-2"></i> Supplier Management
            </a>
            
            <a href="${pageContext.request.contextPath}/GetAllServlet">
                <i class="fas fa-users me-2"></i> User Management
            </a>
            
            
            
        <% } %>
        <a href="#" data-bs-toggle="collapse" data-bs-target="#settingsMenu">
            <i class="fas fa-gear me-2"></i> Settings
        </a>
        <div class="collapse ms-3" id="settingsMenu">
            <a href="${pageContext.request.contextPath}/profile.jsp" class="d-block mt-1">
                <i class="fas fa-sliders-h me-2"></i> Profile
            </a>
        </div>
    </div>

    <div class="main-content w-100">
        <nav class="navbar navbar-expand-lg navbar-light bg-white px-4 shadow-sm">
            <a class="navbar-brand fw-bold" href="#">Autoparts Pvt Ltd</a>
            <div class="ms-auto d-flex align-items-center">
                <%= session.getAttribute("Name") != null ? session.getAttribute("Name") : "Guest" %>
                <div class="dropdown ms-3">
                    <a class="btn btn-light dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
                        <i class="fas fa-user-circle fa-lg"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/profile.jsp"><i class="fas fa-id-badge me-2"></i> Profile</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item text-danger" href="${pageContext.request.contextPath}/LogoutServlet"><i class="fas fa-sign-out-alt me-2"></i> Logout</a></li>
                    </ul>
                </div>
            </div>
        </nav>