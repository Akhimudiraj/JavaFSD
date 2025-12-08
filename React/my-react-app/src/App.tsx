import EmployeeComponen from "./EmployeeComponent";

function HeaderComponent(){
  return (
    <header>this is header</header>
  )
}

function FooterComponent(){
  return (
    <footer>This is footer</footer>
  )
}

function App(){
  //coding
  return (
  
  <div>
    
    <header></header>
    <HeaderComponent></HeaderComponent>
    <h1>Welcome to react </h1>
    <p>this is testing</p>
    <footer></footer>
    <FooterComponent></FooterComponent>
    <EmployeeComponen></EmployeeComponen>

    

  </div>);
}

export default App;