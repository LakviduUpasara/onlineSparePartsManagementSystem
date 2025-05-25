<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Full Trade Support - Error</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      background: #f8f9fa;
    }
    .error-container {
      text-align: center;
      max-width: 600px;
      padding: 2rem;
    }
  </style>
</head>
<body>
  <div class="error-container">
    <h2>Oops! Something Went Wrong</h2>
    <p class="text-danger">We encountered an issue processing your request. Please try again later.</p>
    <p><strong>Error Details:</strong> <%= exception != null ? exception.getMessage() : "Unknown error" %></p>
    <a href="item-list" class="btn btn-primary">Return to Item Dashboard</a>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>