import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'projet26App.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'product',
    data: { pageTitle: 'projet26App.product.home.title' },
    loadChildren: () => import('./product/product.routes'),
  },
  {
    path: 'category',
    data: { pageTitle: 'projet26App.category.home.title' },
    loadChildren: () => import('./category/category.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
